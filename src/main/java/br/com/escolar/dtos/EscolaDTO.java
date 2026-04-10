package br.com.escolar.dtos;


import br.com.escolar.entidades.Aluno;
import br.com.escolar.enums.AnoEscolar;
import br.com.escolar.enums.Turno;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class EscolaDTO {
    private Long id;
    @NotBlank(message = "não pode estar em branco")
    private String nomeEscola;
    @NotBlank(message = "não pode estar em branco")
    private String telefoneEscola;
    @NotNull(message = "não pode ser nulo")
    private int anoLetivo;
    @NotBlank(message = "não pode estar em branco")
    private String turma;
    private Turno turno;
    private AnoEscolar anoEscolar;
    private List<Aluno> alunos = new ArrayList<>();
}
