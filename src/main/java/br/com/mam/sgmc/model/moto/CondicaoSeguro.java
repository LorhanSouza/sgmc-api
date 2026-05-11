package br.com.mam.sgmc.model.moto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "condicao_seguro")
@Data
public class CondicaoSeguro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_condicao_seguro")
    private Long id;
    @Column(name = "tipo", length = 45)
    private String tipo;
    private float valor;

    @ManyToOne
    @JoinColumn(name = "id_seguro")
    private Seguro seguro;
}
