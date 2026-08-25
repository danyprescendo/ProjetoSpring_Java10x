package dev.java10x.CadastroDeNinjas.Missoes;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/missao")
public class MissaoControler {

    private MissaoService missaoService;

    public MissaoControler(MissaoService missaoService) {
        this.missaoService = missaoService;
    }

    // GET -- Mandar uma requisição para mostrar as missões
    @GetMapping("/listar")
    public List<MissaoModel> listarMissoes() {
        return missaoService.listarMissoes();
    }

    // POST -- Mandar uma requisição para criar as missões
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missao criada com sucesso";
    }

    // PUT -- Mandar uma requisição para alterar as missões
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missao alterada com sucesso";
    }

    // DELETE -- Mandar uma requisição para deletar as missões
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missao deletada com Sucesso";
    }
}
