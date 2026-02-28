package br.com.aaf.integracao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.aaf.integracao.model.Boleto;
import br.com.aaf.integracao.model.ContratoAluno;
import br.com.aaf.integracao.repository.ContratoAlunoRepository;

@Service
@Transactional
public class ContratoAlunoService {

	@Autowired
	private ContratoAlunoRepository contratoAlunoRepository;
	
	@Transactional
	public ContratoAluno getContrato(String numero) {
		ContratoAluno contrato = contratoAlunoRepository.getContratoAlunoNative(numero);
		List<Boleto> boletos = contratoAlunoRepository.findBoletosByContratoId(contrato.getId());
		contrato.getBoletos().size();
		contrato.setBoletos(boletos);
		return contrato;
	}

}
