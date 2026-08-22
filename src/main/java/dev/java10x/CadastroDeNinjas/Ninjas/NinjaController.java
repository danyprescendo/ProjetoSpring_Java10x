package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeria mensagem nessa rota";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja Criado";
    }

    // Mostrar todos os Ninjas (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas() {
        return "Todos os Ninjas";
    }

    // Procurar Ninja por ID (CREATE)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorId() {
        return "Todos os Ninjas por Id";
    }
    // Alterar dados do Ninja (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId() {
        return "Altera Ninja por Id";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String DeletarNinjaPorId() {
        return "Ninja Deletado por Id";
    }

}
