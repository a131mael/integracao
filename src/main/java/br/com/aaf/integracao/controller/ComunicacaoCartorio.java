package br.com.aaf.integracao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.aaf.integracao.cartorio.EnviadorTitulosCartorio;
import br.com.aaf.integracao.dto.RetornoEnvioContratoDTO;
import br.com.aaf.integracao.model.ContratoAluno;
import br.com.aaf.integracao.service.ContratoAlunoService;
import br.com.grupobst.services.ConsultarTituloResponse;
import br.com.grupobst.services.EnviarTituloResponse;

@RestController
@RequestMapping("/api")
@Transactional
public class ComunicacaoCartorio {

	@Autowired
	ContratoAlunoService contratoAlunoService;

	
	@GetMapping("/enviarContratoProtesto")
	public ResponseEntity<RetornoEnvioContratoDTO> getalunosAvaliacaoes(@RequestParam(required = true) String idContrato) {
		
		try {
			ContratoAluno contrato = contratoAlunoService.getContrato(idContrato);
			
			EnviadorTitulosCartorio enviador = new EnviadorTitulosCartorio();
			EnviarTituloResponse[] retorno = enviador.enviarTituloProtesto(contrato);
			
			RetornoEnvioContratoDTO response = new RetornoEnvioContratoDTO();
			response.setResponse(retorno);
			response.setCodigo(retorno[0].getResposta().getCodigo());
			
			return new ResponseEntity<>(response, HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@Transactional
	@GetMapping("/recuperarStatus")
	public ResponseEntity<RetornoEnvioContratoDTO> getStatus(@RequestParam(required = true) String idContrato) {
		
		try {
			ContratoAluno contrato = contratoAlunoService.getContrato(idContrato);
			EnviadorTitulosCartorio enviador = new EnviadorTitulosCartorio();
			ConsultarTituloResponse[] retorno = enviador.getStatusTitulo(contrato);
			RetornoEnvioContratoDTO response = new RetornoEnvioContratoDTO();
			System.out.println("Numero do contrato = " + idContrato + " Mensagem: "+retorno[0].getResposta().getMensagem() + " Codigo: " + retorno[0].getResposta().getCodigo());
			response.setMensagem(retorno[0].getResposta().getMensagem());
			response.setCodigo(retorno[0].getResposta().getCodigo());
			
			return new ResponseEntity<>(response, HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

//	@GetMapping("/aluno/alunosavaliacoes")
//	public ResponseEntity<List<AlunoAvaliacao>> getAllQuadrinhos(@RequestParam(required = false) Long idTurma,
//			@RequestParam(required = false) Integer anoletivo, @RequestParam(required = false) Integer bimestre,
//			@RequestParam(required = false) Long idAluno) {
//		try {
//
//			List<AlunoAvaliacao> alunosAvaliacoes = alunoAvaliacaoService.getAlunoAvaliacaoNative(idTurma, anoletivo,	bimestre, idAluno,"");
//
//			return new ResponseEntity<>(alunosAvaliacoes, HttpStatus.OK);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//
//	@GetMapping("/professor/alunosavaliacoes")
//	public ResponseEntity<List<AlunoAvaliacao>> getAllQuadrinhos(@RequestParam(required = false) Long idTurma,
//			@RequestParam(required = false) Integer anoletivo, @RequestParam(required = false) Integer bimestre,
//			@RequestParam(required = false) Long idAluno, @RequestParam(required = false) Long idProfessor) {
//		try {
//
//			List<AlunoAvaliacao> alunosAvaliacoes = alunoAvaliacaoService.getAlunoAvaliacaoNative(idTurma, anoletivo,
//					bimestre, idAluno, idProfessor);
//
//			return new ResponseEntity<>(alunosAvaliacoes, HttpStatus.OK);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}

//    @GetMapping("/alunosavaliacoes/{id}")
//    public ResponseEntity<AlunoAvaliacao> getQuadrinhobyId(@PathVariable("id") long idTurma) {
//        Optional<AlunoAvaliacao> quadrinhoData = alunoAvaliacaoRepository.findById(idTurma);
// 
//        if (quadrinhoData.isPresent()) {
//            return new ResponseEntity<>(quadrinhoData.get(), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
// 
//    @PostMapping("/alunoavaliacao")
//    public ResponseEntity<AlunoAvaliacao> createQuadrinho(@RequestBody AlunoAvaliacao alunoAvaliacao) {
//        try {
//        	
//        	
//            AlunoAvaliacao _alunoAvaliacao  = alunoAvaliacaoRepository.save(alunoAvaliacao);
//            return new ResponseEntity<>(_alunoAvaliacao, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
// 
//    @PutMapping("/alunosavaliacoes/{id}")
//    public ResponseEntity<AlunoAvaliacao> updateAlunoAvaliacao(@PathVariable("id") long id, @RequestBody AlunoAvaliacao alunoAvaliacao) {
//        Optional<AlunoAvaliacao> alunoAvaliacaoData = alunoAvaliacaoRepository.findById(id);
// 
//        if (alunoAvaliacaoData.isPresent()) {
//        	AlunoAvaliacao _alunoAvaliacao = alunoAvaliacaoData.get();
//        	_alunoAvaliacao.setAluno(alunoAvaliacao.getAluno());
//        	_alunoAvaliacao.setAnoLetivo(alunoAvaliacao.getAnoLetivo());
//        	_alunoAvaliacao.setAvaliacao(alunoAvaliacao.getAvaliacao());
//            return new ResponseEntity<>(alunoAvaliacaoRepository.save(_alunoAvaliacao), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
// 
//    @DeleteMapping("/alunosavaliacoes/{id}")
//    public ResponseEntity<HttpStatus> deleteQuadrinho(@PathVariable("id") long id) {
//        try {
//            alunoAvaliacaoRepository.deleteById(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
// 
////    @GetMapping("/turmas/{idturma}/{bimestre}")
////    public ResponseEntity<List<AlunoAvaliacao>> findByEditora(@PathVariable("idturma") Long idTurma, int bimestre) {
////        try {
////            List<AlunoAvaliacao> quadrinhos = alunoAvaliacaoRepository.findByTurmaEBimestre(idTurma, BimestreEnum.values()[bimestre-1]);
//// 
////            if (quadrinhos.isEmpty()) {
////                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
////            }
//// 
////            return new ResponseEntity<>(quadrinhos, HttpStatus.OK);
//// 
////        } catch (Exception e) {
////            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
////        }
////    }
//	
}
