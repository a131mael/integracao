package br.com.aaf.integracao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import br.com.aaf.integracao.model.ContratoAluno;

public interface ContratoAlunoRepository extends JpaRepository<ContratoAluno, Long> {

	
	@Transactional
	@Query(value = "select contratoAluno from ContratoAluno contratoAluno JOIN FETCH contratoAluno.boletos"
			+ "	where contratoAluno.numero = (:numero)")
	public ContratoAluno getContratoAlunoNative(@Param("numero") String numero);
	

}
