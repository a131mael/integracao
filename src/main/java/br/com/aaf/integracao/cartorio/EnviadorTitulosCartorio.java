package br.com.aaf.integracao.cartorio;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.springframework.transaction.annotation.Transactional;

import br.com.grupobst.services.AutenticarRequest;
import br.com.grupobst.services.AutenticarResponse;
import br.com.grupobst.services.ConsultarTituloRequest;
import br.com.grupobst.services.ConsultarTituloResponse;
import br.com.grupobst.services.EnviarTituloRequest;
import br.com.grupobst.services.EnviarTituloResponse;
import br.com.grupobst.services.ProtestoInterface;
import br.com.grupobst.services.ServicesLocator;

public class EnviadorTitulosCartorio {

	private String usuario = "favodemel_ws179";
	private String senha = "ws_awnv3375";
	/*
	 * Usuarios senha de homologacao
	 * private String usuario = "favodemel_WS179"; private String senha =
	 * "ws_rnpf1301";
	 */
	
	ServicesLocator sl = new ServicesLocator();
	ProtestoInterface protestarInterface;
	private String token = "";
	
	private String autenticar(String usuario, String senha) {
		try {
			protestarInterface = sl.getProtestoPort();
			AutenticarRequest autenticar = new AutenticarRequest();
			autenticar.setUsuario(usuario);
			autenticar.setSenha(senha);
			AutenticarResponse response = protestarInterface.autenticar(autenticar);
			setToken(response.getToken());
			return response.getToken();
		} catch (ServiceException e) {
			e.printStackTrace();
			setToken(null);
			return null;
		} catch (RemoteException e) {
			e.printStackTrace();
			setToken(null);
			return null;
		}
	}
	
	@Transactional
	public EnviarTituloResponse[] enviarTituloProtesto(br.com.aaf.integracao.model.ContratoAluno contrato) throws IOException {
		
		if(token != null && !token.equalsIgnoreCase("")) {
			return enviarTitulo(contrato);
		}else {
			autenticar(usuario, senha);
			return enviarTitulo(contrato);
		}
	}
	
	public ConsultarTituloResponse[] getStatusTitulo(br.com.aaf.integracao.model.ContratoAluno contrato) throws IOException {
		if(token != null && !token.equalsIgnoreCase("")) {
			return consultarTitulo(contrato);
		}else {
			autenticar(usuario, senha);
			return consultarTitulo(contrato);
		}
	}
	
	@Transactional
	private EnviarTituloResponse[] enviarTitulo(br.com.aaf.integracao.model.ContratoAluno contrato) throws IOException {
		EnviarTituloResponse[] resposta = null;
		Parcer parse = new Parcer();
		EnviarTituloRequest[] tituloProtestar = parse.getTituloProtestar(contrato);
		resposta = protestarInterface.enviarTitulo(token,tituloProtestar);
		if("WS_ERR_002".equalsIgnoreCase(resposta[0].getResposta().getCodigo())) {
			autenticar(usuario, senha);
			resposta = protestarInterface.enviarTitulo(token,tituloProtestar);
		}
		
		if(("WS_SUC_200".equalsIgnoreCase(resposta[0].getResposta().getCodigo())) || 
				("WS_SUC_201".equalsIgnoreCase(resposta[0].getResposta().getCodigo()))) {
		}
		return resposta;
	}
	
	@Transactional
	private ConsultarTituloResponse[] consultarTitulo(br.com.aaf.integracao.model.ContratoAluno contrato) throws IOException {
		Parcer parse = new Parcer();
		ConsultarTituloResponse[] resposta = null;
		ConsultarTituloRequest[] consulta = parse.getTituloConsulta(contrato); 
		
		resposta = protestarInterface.consultarTitulo(token, null, null, null, consulta);
		if("WS_ERR_002".equalsIgnoreCase(resposta[0].getResposta().getCodigo())) {
			autenticar(usuario, senha);
			resposta = protestarInterface.consultarTitulo(token, null, null, null, consulta);
		}
		
		if(("WS_SUC_200".equalsIgnoreCase(resposta[0].getResposta().getCodigo())) || 
				("WS_SUC_201".equalsIgnoreCase(resposta[0].getResposta().getCodigo()))) {
		}
		System.out.println(resposta);
		return resposta;
	}
	
	@Transactional
	private ConsultarTituloResponse[] consultarTitulo(String token, br.com.aaf.integracao.model.ContratoAluno contrato) throws IOException {
		Parcer parse = new Parcer();
		ConsultarTituloResponse[] resposta = null;
		ConsultarTituloRequest[] consulta = parse.getTituloConsulta(contrato); 
		
		
		resposta = protestarInterface.consultarTitulo(token, null, null, null, consulta);
		if("WS_ERR_002".equalsIgnoreCase(resposta[0].getResposta().getCodigo())) {
			autenticar(usuario, senha);
			resposta = protestarInterface.consultarTitulo(token, null, null, null, consulta);
		}
		
		if(("WS_SUC_200".equalsIgnoreCase(resposta[0].getResposta().getCodigo())) || 
				("WS_SUC_201".equalsIgnoreCase(resposta[0].getResposta().getCodigo()))) {
		}
		return resposta;
	}
	
	
	public boolean enviarTituloProtesto(org.escola.model.ContratoAluno contrato) {
		return false;
	}
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}
