package br.com.escolar.dtos;

import br.com.escolar.entidades.Aluno;
import br.com.escolar.entidades.Endereco;
import br.com.escolar.entidades.Pagamento;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class ResponsavelDtoSemCpf {

    private Long id;
    private String nomeResponsavel;
    private String telefone;
    private String email;
    private List<Endereco> endereco = new ArrayList<>();
    private List<Aluno>alunos = new ArrayList<>();
    private List<Pagamento>pagamentos = new ArrayList<>();
}
