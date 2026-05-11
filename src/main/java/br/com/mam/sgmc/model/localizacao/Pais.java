package br.com.mam.sgmc.model.localizacao;

import java.util.List;

import br.com.mam.sgmc.model.Identificacao;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "pais")
@Data
public class Pais {
    @Id
    @Column(name = "pais_sigla", length = 3)
    private String sigla;
    @Column(name = "nome", length = 150)
    private String nome;
    @Column(name = "continente", length = 50)
    private String continente;

    @OneToOne(mappedBy = "pais")
    private Uf uf;

    @OneToMany(mappedBy = "pais")
    private List<Identificacao> identifications;
}
