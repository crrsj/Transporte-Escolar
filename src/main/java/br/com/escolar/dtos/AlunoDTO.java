package br.com.escolar.dtos;


import br.com.escolar.entidades.Escola;
import br.com.escolar.entidades.Responsavel;
import br.com.escolar.enums.Sexo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AlunoDTO {

    private Long id;
    @NotBlank(message = "não pode estar em branco")
    private String nomeAluno;
    @NotNull(message="não pode ser nulo")
    private int idade;
    private Sexo sexo;
    private Responsavel responsavel;
    private Escola escola;
}
