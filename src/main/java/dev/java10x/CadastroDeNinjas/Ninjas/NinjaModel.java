package dev.java10x.CadastroDeNinjas.Ninjas;
import dev.java10x.CadastroDeNinjas.Missoes.MissaoModel;
import jakarta.persistence.*;
import lombok.*;

// Entity transforma uma classe em uma entidade do DB
// JPA -> Java Persistence API
@Entity
@Table(name = "tb_ninja")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true) // Coluna de valor único, não pode se repetir
    private String email;

    private int idade;

    //@ManyToOne -> um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missao_id") // Foreign Key
    private MissaoModel missao;

}