package dev.java10x.CadastroDeNinjas.Missoes;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
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

    // GET -- Procurar Missao por ID
    @GetMapping("/listar/{id}")
    public MissaoModel listarMissaoPorId(@PathVariable Long id) {
        return missaoService.listarMissaoPorId(id);
    }

    // POST -- Mandar uma requisição para criar as missões
    @PostMapping("/criar")
    public MissaoModel criarMissao(@RequestBody MissaoModel missao) {
        return missaoService.criarMissao(missao);
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
