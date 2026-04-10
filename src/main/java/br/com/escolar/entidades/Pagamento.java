package br.com.escolar.entidades;

import br.com.escolar.enums.StatusPagamento;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pagador;
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDate dataPagamento;
    private BigDecimal valorMensalidade;
    @Enumerated(EnumType.STRING)
    private StatusPagamento status;
    @ManyToOne
    @JoinColumn(name = "responsavel_id")
    @JsonIgnore
    private Responsavel responsavel;
}
