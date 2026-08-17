package dev.java10x.CadastroDeNinjas.Missoes;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_missao")
@Data // Notação do Lombock para gerar os getters e setters
@NoArgsConstructor // Notação do Lombock para Construtor Vazio
@AllArgsConstructor // Notação do Lombock para Construtor AllArgs
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    //OneToMany -> uma missão pode ter muitos ninjas
    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninja;

}