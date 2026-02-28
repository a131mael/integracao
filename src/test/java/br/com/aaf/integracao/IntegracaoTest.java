package br.com.aaf.integracao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.util.Base64;
import java.util.Calendar;

import javax.xml.rpc.ServiceException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import com.jayway.jsonpath.ParseContext;

import br.com.aaf.integracao.cartorio.Parcer;
import br.com.aaf.integracao.model.ContratoAluno;
import br.com.grupobst.services.AutenticarRequest;
import br.com.grupobst.services.AutenticarResponse;
import br.com.grupobst.services.ConsultarTituloRequest;
import br.com.grupobst.services.ConsultarTituloResponse;
import br.com.grupobst.services.DevedorEnviar;
import br.com.grupobst.services.DividaEnviar;
import br.com.grupobst.services.DocumentoEnviar;
import br.com.grupobst.services.EnviarTituloRequest;
import br.com.grupobst.services.ProtestoInterface;
import br.com.grupobst.services.ServicesLocator;
import br.com.grupobst.services.XmlCalculo;
import br.com.grupobst.services.XmlPlanilha;

class IntegracaoTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	private String usuario = "forquilhinha_ws";
	private String senha = "sqilhzez3736$$";
	ServicesLocator sl = new ServicesLocator();
	ProtestoInterface protestarInterface;

	@Test
	private String autenticar(String usuario, String senha) {
		try {
			protestarInterface = sl.getProtestoPort();
			AutenticarRequest autenticar = new AutenticarRequest();
			autenticar.setUsuario(usuario);
			autenticar.setSenha(senha);
			AutenticarResponse response = protestarInterface.autenticar(autenticar);
			System.out.println(response.getToken());
			return response.getToken();
		} catch (ServiceException e) {
			e.printStackTrace();
			return null;
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}

	private DevedorEnviar[] getDevedor() {
		DevedorEnviar devedor = new DevedorEnviar();
		devedor.setNome("Nome do devedor");
		devedor.setDocumentoTipo("001");
		devedor.setDocumento("06660604952");
		devedor.setEndereco("manoel joaquim de souza "); // ateh 100
		devedor.setNumero("97");
		devedor.setComplemento("casa");
		devedor.setCep("88132700");
		devedor.setBairro("Bela vista");
		devedor.setMunicipio("Palhoca");
		devedor.setUf("SC");
		devedor.setFone("999484089");
		devedor.setEmail("a131mael@gmail.com");

		DevedorEnviar[] devedores = new DevedorEnviar[1];
		devedores[0] = devedor;
		return devedores;
	}

	private DocumentoEnviar getDocumento() throws IOException {
		DocumentoEnviar documento = new DocumentoEnviar();
		documento.setExtensao("DOCX"); // PDF pnj ou zip
		// TODO verificar se nao funciona apenas para PDF
		encodeFileToBase64Binary(null);
		documento.setDocumentoBase64(null);
		
		return documento;
	}
	
	private XmlPlanilha getPlanilha(int numeroParcelasContrato) {
		XmlPlanilha planilha = new XmlPlanilha();
		planilha.setMulta(null);
		planilha.setMora(null);
		planilha.setJuros(null);
		planilha.setCalculo(getParcelasContrato(numeroParcelasContrato));
		
		return planilha;
	}
	
	private XmlCalculo[] getParcelasContrato(int numeroParcelasContrato) {
		XmlCalculo[] calculoPlanilaha = new XmlCalculo[numeroParcelasContrato]; 
		XmlCalculo parcela1 = new XmlCalculo();
		parcela1.setJuros(null);
		parcela1.setMora(null);
		parcela1.setMulta(null);
		parcela1.setParcela(null);
		parcela1.setSaldo(null);
		parcela1.setValor(null);
		parcela1.setVencimento(null);

		return calculoPlanilaha;
	}
	
	private DividaEnviar getDivida(int numeroParcelasContrato) throws IOException {
		DividaEnviar divida = new DividaEnviar();
		divida.setEspecie("CTI");
		divida.setNossoNumero("12345"); // Id do contrato
		divida.setValor("200.00"); // valor total do contrato é .
		divida.setSaldo("100"); // valorRestanteDaDivida
		divida.setTipoEndosso("B"); // TODO VERIFICAR O QUE È
		divida.setAceite("S");
		divida.setEmissao("01/01/2022"); // data emissao contrato DD/MM/AAAA
		divida.setVencimento("99999999");
		divida.setPracaManual("8233");
		
		divida.setDocumento(0, getDocumento());
		divida.setPlanilha(getPlanilha(numeroParcelasContrato));
		return divida;
	}
	
	private EnviarTituloRequest[] getTituloProtestar(int numeroParcelasContrato) throws IOException {
		EnviarTituloRequest tituloEnviar = new EnviarTituloRequest();
		tituloEnviar.setAlteracao("N");
		tituloEnviar.setDevedor(getDevedor());
		tituloEnviar.setDivida(getDivida(numeroParcelasContrato));
		EnviarTituloRequest[] titulos = new EnviarTituloRequest[1];
		titulos[0] = tituloEnviar;
		
		return titulos;
	}
	
	//@Test
	public void testWS() {
		
		try {
			Parcer parse = new Parcer();
			EnviarTituloRequest[] titulloProtestar = parse.getTituloProtestar(null);
			
			
			protestarInterface.enviarTitulo(autenticar(usuario, senha),titulloProtestar);

			assertEquals("a", "a");

		} catch (Exception e) {
			System.out.println("Exception: " + e);
			fail(e.toString());
		}
	}

		@Test
		public void testConsulta() {
			ContratoAluno contrato = new ContratoAluno();
			contrato.setCpfResponsavel("00438205901");
			contrato.setId(1846L);
			contrato.setNumero("23105750144");
			
			Calendar c = Calendar.getInstance();
			c.set(2023, Calendar.FEBRUARY, 14);
			contrato.setDataCancelamento(c.getTime());
			contrato.setAno((short) 2023);
			try {
				Parcer parse = new Parcer();
				ConsultarTituloRequest[] titulloProtestar = parse.getTituloConsulta(contrato);
				
				autenticar(usuario, senha);
				ConsultarTituloResponse[] response = protestarInterface.consultarTitulo(autenticar(usuario, senha),null, null, null, titulloProtestar);
				response[0].getResposta().getCodigo();
				response[0].getResposta().getMensagem();
				assertEquals("a", "a");

			} catch (Exception e) {
				System.out.println("Exception: " + e);
				fail(e.toString());
			}
		}

	
	
	// TODO metodos auxiliares ir para utils
	private String encodeFileToBase64Binary(File file) throws IOException {

		byte[] bytes = loadFile(file);
		byte[] encoded = Base64.getEncoder().encode(bytes);
		String encodedString = new String(encoded);

		return encodedString;
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

}
