package br.com.aaf.integracao.cartorio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import br.com.aaf.integracao.model.ContratoAluno;
import br.com.aaf.integracao.model.StatusBoletoEnum;
import br.com.aaf.integracao.model.Verificador;
import br.com.grupobst.services.ConsultarTituloRequest;
import br.com.grupobst.services.DevedorConsultar;
import br.com.grupobst.services.DevedorEnviar;
import br.com.grupobst.services.DividaConsultar;
import br.com.grupobst.services.DividaEnviar;
import br.com.grupobst.services.DocumentoEnviar;
import br.com.grupobst.services.EnviarTituloRequest;
import br.com.grupobst.services.XmlCalculo;
import br.com.grupobst.services.XmlPlanilha;

public class Parcer {
	
	
	public EnviarTituloRequest[] getTituloProtestar(ContratoAluno contrato) throws IOException {
		EnviarTituloRequest tituloEnviar = new EnviarTituloRequest();
		
		if(contrato.getComentarioWebService() != null) {
			tituloEnviar.setAlteracao("S");
		}else {
			tituloEnviar.setAlteracao("N");
		}
	
		
		tituloEnviar.setDevedor(getDevedorList(contrato));
		tituloEnviar.setDivida(getDivida(contrato));
		EnviarTituloRequest[] titulos = new EnviarTituloRequest[1];
		titulos[0] = tituloEnviar;
		
		return titulos;
	}
	

	// TODO verificar o numero do endereço
	public DevedorEnviar getDevedor(ContratoAluno contrato) {
		DevedorEnviar devedor = new DevedorEnviar();
		devedor.setNome(contrato.getNomeResponsavel());
		devedor.setDocumentoTipo("001");
		devedor.setDocumento(contrato.getCpfResponsavel());
		devedor.setEndereco(contrato.getEndereco());
		if(contrato.getEnderecoNumero() == null || "".equalsIgnoreCase(contrato.getEnderecoNumero())) {
			devedor.setNumero("0");
		}else {
			devedor.setNumero(contrato.getEnderecoNumero());
		}
		devedor.setCep(contrato.getCep().replace(" ", "").replace("-", ""));
		devedor.setBairro(contrato.getBairro());
		devedor.setMunicipio(contrato.getCidade());
		devedor.setUf("SC");

		return devedor;
	}

	// TODO verificar o numero do endereço
	public DevedorEnviar getDevedor(org.escola.model.ContratoAluno contrato) {
		DevedorEnviar devedor = new DevedorEnviar();
		devedor.setNome(contrato.getNomeResponsavel());
		devedor.setDocumentoTipo("001");
		devedor.setDocumento(contrato.getCpfResponsavel());
		devedor.setEndereco(null);
		devedor.setNumero(contrato.getNumero());
		devedor.setCep(contrato.getCep());
		devedor.setBairro(contrato.getBairro());
		devedor.setMunicipio(contrato.getCidade());
		devedor.setUf("SC");
		devedor.setFone(contrato.getAluno().getContatoTelefone1());
		devedor.setEmail(contrato.getAluno().getContatoEmail1());

		return devedor;
	}
	
	public DevedorEnviar[] getDevedorList(ContratoAluno contrato) {
		DevedorEnviar[] devedores = new DevedorEnviar[1];
		devedores[0] = getDevedor(contrato);
		return devedores;
	}
	
	public DevedorEnviar[] getDevedorList(org.escola.model.ContratoAluno contrato) {
		DevedorEnviar[] devedores = new DevedorEnviar[1];
		devedores[0] = getDevedor(contrato);
		return devedores;
	}

	public DividaEnviar getDivida(ContratoAluno contrato) throws IOException {
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.DATE_FIELD, new Locale("pt", "BR"));
		String dataExtenso = formatador.format(new Date());

		//SecureRandom rand = new SecureRandom();
		//+rand.nextInt(100)
		
		DividaEnviar divida = new DividaEnviar();
		divida.setNumero(contrato.getNumero());
		divida.setFinsFalimentares("N");
		divida.setDeclaracaoPortador("D");
		//divida.setPracaManual("8233");
		
		divida.setEspecie("CTI");
		divida.setNossoNumero(String.valueOf(contrato.getId()));

		String total = ((contrato.getNumeroParcelas() * contrato.getValorMensal()) + "");
		divida.setValor(total);
		divida.setSaldo(getTotalAberto(contrato)); // valorRestanteDaDivida
		divida.setTipoEndosso("B"); // TODO VERIFICAR O QUE È
		divida.setAceite("N");
		divida.setEmissao(formatador.format(contrato.getDataCriacaoContrato())); // data emissao contrato DD/MM/AAAA
		//divida.setVencimento("99999999");
		
		Calendar cal = Calendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		
		
		if((short)anoAtual == (short)contrato.getAno()) {
			cal.setTime(contrato.getDataCancelamento());
		}else {
			cal.setTime(contrato.getDataCriacaoContrato());
			cal.set(contrato.getAno(), Calendar.DECEMBER, 31, 23, 59, 59);
		}
		
		// 
		divida.setVencimento(formatador.format(cal.getTime()));
		

		if(contrato.getContratoScaneado() == null || contrato.getContratoScaneado().equalsIgnoreCase("")) {
			divida.setDocumento(getDocumentoBase64("123"));	
		}else {
			divida.setDocumento(getDocumentoBase64(contrato.getContratoScaneado()));
		}
		
		divida.setPlanilha(getPlanilha(contrato));
		return divida;
	}

	private XmlPlanilha getPlanilha(ContratoAluno contrato) {
		XmlPlanilha planilha = new XmlPlanilha();
		
		double mora = 0d;
		double multa = 0d;
		 XmlCalculo[] parcelas = getParcelasContrato(contrato);
		for(XmlCalculo calculo : parcelas ) {
			mora += Double.parseDouble(calculo.getMora());
			multa += Double.parseDouble(calculo.getMulta());
		}
		planilha.setMulta(multa+"");
		planilha.setMora(mora+"");
		planilha.setJuros("");
		planilha.setCalculo(parcelas);

		return planilha;
	}

	private XmlCalculo[] getParcelasContrato(ContratoAluno contrato) {
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.DATE_FIELD, new Locale("pt", "BR"));
		XmlCalculo[] calculoPlanilaha = new XmlCalculo[contrato.getNumeroParcelas()];
		for (int i = 1; i <= contrato.getBoletos().size(); i++) {
			
			Double valorAtualizado = Verificador.getValorFinal(contrato.getBoletos().get(i - 1)); 
			
			XmlCalculo parcela1 = new XmlCalculo();
			
			parcela1.setJuros("");
			parcela1.setParcela((contrato.getBoletos().size() - i+ + 1)+"");
			parcela1.setValor(contrato.getBoletos().get(i - 1).getValorNominal()+"");
			parcela1.setVencimento(formatador.format(contrato.getBoletos().get(i - 1).getVencimento()));	
			
			if (Verificador.getStatusEnum(contrato.getBoletos().get(i - 1)).equals(StatusBoletoEnum.PAGO)
					|| Verificador.getStatusEnum(contrato.getBoletos().get(i - 1)).equals(StatusBoletoEnum.CANCELADO)
					) {
				
				parcela1.setSaldo("0.00");
				parcela1.setMulta("0.00");
				parcela1.setMora("0.00");
				if (Verificador.getStatusEnum(contrato.getBoletos().get(i - 1)).equals(StatusBoletoEnum.A_VENCER) ) {
					parcela1.setMulta("0.00");
					parcela1.setMora("0.00");
				}
				
			} else if (Verificador.getStatusEnum(contrato.getBoletos().get(i - 1)).equals(StatusBoletoEnum.A_VENCER) ) {
				parcela1.setMulta("0.00");
				parcela1.setMora("0.00");
				parcela1.setSaldo(contrato.getBoletos().get(i - 1).getValorNominal()+"");
			} else {
				
				parcela1.setSaldo(contrato.getBoletos().get(i - 1).getValorNominal()+"");
				double multa = contrato.getBoletos().get(i - 1).getValorNominal() * 0.02;
				double juros =  valorAtualizado - multa - contrato.getBoletos().get(i - 1).getValorNominal();
				parcela1.setMulta(multa+"");
				parcela1.setMora(juros+"");
				
			}
			
			calculoPlanilaha[contrato.getBoletos().size()-i] = parcela1;
			
		}
		

		return calculoPlanilaha;
	}

	private DocumentoEnviar[] getDocumento(String localArmazenamentoContrato) throws IOException {
		DocumentoEnviar documento = new DocumentoEnviar();
		documento.setExtensao("PDF"); 
		String arquivoNaBse64 = encodeFileToBase64Binary(localArmazenamentoContrato);
		documento.setDocumentoBase64(arquivoNaBse64);
		
		DocumentoEnviar[] docs = new DocumentoEnviar[1]; 
		docs[0] = documento;
		return docs;
	}

	private DocumentoEnviar[] getDocumentoBase64(String arquivoBase64) throws IOException {
		DocumentoEnviar documento = new DocumentoEnviar();
		documento.setExtensao("PDF"); 
		documento.setDocumentoBase64(arquivoBase64);
		
		DocumentoEnviar[] docs = new DocumentoEnviar[1]; 
		docs[0] = documento;
		return docs;
	}

	
	public DocumentoEnviar[] getDocumento(byte[] bytes) throws IOException {
		DocumentoEnviar documento = new DocumentoEnviar();
		documento.setExtensao("PDF"); 
		
		byte[] encoded = Base64.getEncoder().encode(bytes);
		String arquivoNaBse64 = new String(encoded);
		documento.setDocumentoBase64(arquivoNaBse64);
		
		DocumentoEnviar[] docs = new DocumentoEnviar[1]; 
		docs[0] = documento;
		return docs;

	}
	
	
	public ConsultarTituloRequest[] getTituloConsulta(ContratoAluno contrato) {
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.DATE_FIELD, new Locale("pt", "BR"));
		
		
		ConsultarTituloRequest consulta = new ConsultarTituloRequest();
		
		DevedorConsultar devedor = new DevedorConsultar();
		devedor.setDocumento(contrato.getCpfResponsavel());
		consulta.setDevedor(devedor);
		
		DividaConsultar divida = new DividaConsultar();
		divida.setNumero(contrato.getNumero());
		divida.setNossoNumero(String.valueOf(contrato.getId()));
		
		Calendar cal = Calendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		
		if((short)anoAtual == (short)contrato.getAno()) {
			cal.setTime(contrato.getDataCancelamento());
		}else {
			cal.setTime(contrato.getDataCriacaoContrato());
			cal.set(contrato.getAno(), Calendar.DECEMBER, 31, 23, 59, 59);
		}
		
		// 
		divida.setVencimento(formatador.format(cal.getTime()));
		
		
		consulta.setDivida(divida);
		ConsultarTituloRequest[] retorno = new ConsultarTituloRequest[1];
		retorno[0] = consulta;
		
		return retorno;
	}
	
	
	// TODO metodos auxiliares ir para utils
	private String encodeFileToBase64Binary(File file) throws IOException {

		byte[] bytes = loadFile(file);
		byte[] encoded = Base64.getEncoder().encode(bytes);
		String encodedString = new String(encoded);

		return encodedString;
	}
	
	private String encodeFileToBase64Binary(String path) throws IOException {
		return encodeFileToBase64Binary(new File(path));
	}

	private byte[] loadFile(File file) throws IOException {
		byte[] bytes;
		try (InputStream is = new FileInputStream(file)) {
			long length = file.length();
			if (length > Integer.MAX_VALUE) {
				throw new IOException("File to large " + file.getName());
			}
			bytes = new byte[(int) length];
			int offset = 0;
			int numRead = 0;
			while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
				offset += numRead;
			}
			if (offset < bytes.length) {
				throw new IOException("Could not completely read file " + file.getName());
			}
		}
		return bytes;
	}

	private String getTotalAberto(ContratoAluno contrato) {
		double totalAberto = 0;
		for (int i = contrato.getBoletos().size(); i > 0; i--) {
			if (i == 12) {
				if (Verificador.getStatusEnum(contrato.getBoletos().get(i - 1)).equals(StatusBoletoEnum.PAGO)
						|| Verificador.getStatusEnum(contrato.getBoletos().get(i - 1))
								.equals(StatusBoletoEnum.CANCELADO)) {
				} else {
					totalAberto += Verificador.getValorFinal(contrato.getBoletos().get(i - 1));
				}
			} else if (i == 11) {
				if (Verificador.getStatusEnum(contrato.getBoletos().get(i - 1)).equals(StatusBoletoEnum.PAGO)
						|| Verificador.getStatusEnum(contrato.getBoletos().get(i - 1))
								.equals(StatusBoletoEnum.CANCELADO)) {
				} else {
					totalAberto += Verificador.getValorFinal(contrato.getBoletos().get(i - 1));
				}
			} else if (i == 10) {
				if (Verificador.getStatusEnum(contrato.getBoletos().get(i - 1)).equals(StatusBoletoEnum.PAGO)
						|| Verificador.getStatusEnum(contrato.getBoletos().get(i - 1))
								.equals(StatusBoletoEnum.CANCELADO)) {
				} else {
					totalAberto += Verificador.getValorFinal(contrato.getBoletos().get(i - 1));
				}
			}

			if (i == 9) {
				if (Verificador.getStatusEnum(contrato.getBoletos().get(i - 1)).equals(StatusBoletoEnum.PAGO)
						|| Verificador.getStatusEnum(contrato.getBoletos().get(i - 1))
								.equals(StatusBoletoEnum.CANCELADO)) {
				} else {
					totalAberto += Verificador.getValorFinal(contrato.getBoletos().get(i - 1));
				}
			}
			if (i == 8) {
				if (Verificador.getStatusEnum(contrato.getBoletos().get(i - 1)).equals(StatusBoletoEnum.PAGO)
						|| Verificador.getStatusEnum(contrato.getBoletos().get(i - 1))
								.equals(StatusBoletoEnum.CANCELADO)) {
				} else {
					totalAberto += Verificador.getValorFinal(contrato.getBoletos().get(i - 1));
				}
			}
			if (i == 7) {
				if (Verificador.getStatusEnum(contrato.getBoletos().get(i - 1)).equals(StatusBoletoEnum.PAGO)
						|| Verificador.getStatusEnum(contrato.getBoletos().get(i - 1))
								.equals(StatusBoletoEnum.CANCELADO)) {
				} else {
					totalAberto += Verificador.getValorFinal(contrato.getBoletos().get(i - 1));
				}
			}
			if (i == 6) {
				if (Verificador.getStatusEnum(contrato.getBoletos().get(i - 1)).equals(StatusBoletoEnum.PAGO)
						|| Verificador.getStatusEnum(contrato.getBoletos().get(i - 1))
								.equals(StatusBoletoEnum.CANCELADO)) {
				} else {
					totalAberto += Verificador.getValorFinal(contrato.getBoletos().get(i - 1));
				}
			}
			if (i == 5) {
				if (Verificador.getStatusEnum(contrato.getBoletos().get(i - 1)).equals(StatusBoletoEnum.PAGO)
						|| Verificador.getStatusEnum(contrato.getBoletos().get(i - 1))
								.equals(StatusBoletoEnum.CANCELADO)) {
				} else {
					totalAberto += Verificador.getValorFinal(contrato.getBoletos().get(i - 1));
				}
			}
			if (i == 4) {
				if (Verificador.getStatusEnum(contrato.getBoletos().get(i - 1)).equals(StatusBoletoEnum.PAGO)
						|| Verificador.getStatusEnum(contrato.getBoletos().get(i - 1))
								.equals(StatusBoletoEnum.CANCELADO)) {
				} else {
					totalAberto += Verificador.getValorFinal(contrato.getBoletos().get(i - 1));
				}
			}
			if (i == 3) {
				if (Verificador.getStatusEnum(contrato.getBoletos().get(i - 1)).equals(StatusBoletoEnum.PAGO)
						|| Verificador.getStatusEnum(contrato.getBoletos().get(i - 1))
								.equals(StatusBoletoEnum.CANCELADO)) {
				} else {
					totalAberto += Verificador.getValorFinal(contrato.getBoletos().get(i - 1));
				}
			}
			if (i == 2) {
				if (Verificador.getStatusEnum(contrato.getBoletos().get(i - 1)).equals(StatusBoletoEnum.PAGO)
						|| Verificador.getStatusEnum(contrato.getBoletos().get(i - 1))
								.equals(StatusBoletoEnum.CANCELADO)) {
				} else {
					totalAberto += Verificador.getValorFinal(contrato.getBoletos().get(i - 1));
				}
			}
			if (i == 1) {
				if (Verificador.getStatusEnum(contrato.getBoletos().get(i - 1)).equals(StatusBoletoEnum.PAGO)
						|| Verificador.getStatusEnum(contrato.getBoletos().get(i - 1))
								.equals(StatusBoletoEnum.CANCELADO)) {
				} else {
					totalAberto += Verificador.getValorFinal(contrato.getBoletos().get(i - 1));
				}
			}

		}
		return Double.toString(totalAberto);
	}
}
