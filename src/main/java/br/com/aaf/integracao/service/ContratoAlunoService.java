package br.com.aaf.integracao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.aaf.integracao.model.ContratoAluno;
import br.com.aaf.integracao.repository.ContratoAlunoRepository;

@Service
@Transactional
public class ContratoAlunoService {

	@Autowired
	private ContratoAlunoRepository contratoAlunoRepository;
	
	@Transactional
	public ContratoAluno getContrato(String numero) {
		return contratoAlunoRepository.getContratoAlunoNative(numero);
	}

}
