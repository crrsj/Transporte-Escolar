package br.com.escolar.entidades;

import br.com.escolar.enums.AnoEscolar;
import br.com.escolar.enums.Turno;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Escola {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeEscola;
    private String telefoneEscola;
    private int anoLetivo;
    private String turma;
    @Enumerated(EnumType.STRING)
    private Turno turno;
    @Enumerated(EnumType.STRING)
    private AnoEscolar anoEscolar;
    @OneToMany(mappedBy = "escola",cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonIgnore
    private List<Aluno>alunos = new ArrayList<>();
}
