package br.com.aaf.integracao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.aaf.integracao.model.Boleto;
import br.com.aaf.integracao.model.ContratoAluno;

public interface ContratoAlunoRepository extends JpaRepository<ContratoAluno, Long> {

	
	
	@Query(value = "select distinct  contratoAluno from ContratoAluno contratoAluno left join fetch contratoAluno.boletos"
			+ "	where contratoAluno.numero = (:numero)")
	public ContratoAluno getContratoAlunoNative(@Param("numero") String numero);
	
	@Query(value = "select b from Boleto b where b.contrato.id = :contratoId order by b.vencimento asc")
	public List<Boleto> findBoletosByContratoId(@Param("contratoId") Long contratoId);

}
