package br.com.fiap.trafegos.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "tbl_trafegos")
public class Trafego {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_TRAFEGOS"
    )
    @SequenceGenerator(
            name = "SEQ_TRAFEGOS",
            sequenceName = "SEQ_TRAFEGOS",
            allocationSize = 1
    )
    private Long id;
    private String estado;
    private String cidade;
    private String situacao;
    @Column(name = "data_ocorrido")
    private LocalDate dataOcorrido;


}
