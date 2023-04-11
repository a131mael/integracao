package br.com.aaf.integracao.dto;

import java.io.Serializable;

import br.com.grupobst.services.EnviarTituloResponse;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RetornoEnvioContratoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String codigo;
	private String mensagem;
	private String token;
	
	private EnviarTituloResponse[] response;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public EnviarTituloResponse[] getResponse() {
		return response;
	}

	public void setResponse(EnviarTituloResponse[] response) {
		this.response = response;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	} 
	
}
