package br.com.mam.sgmc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.mam.sgmc.model.Sede;

public interface SedeRepository extends JpaRepository<Sede, Long> {
    Sede findByNome(String nome);

    Sede findByCidade(String cidade);

    @Query("""
            SELECT s FROM Sede s
            JOIN s.cidade c
            WHERE (:uf IS NULL OR s.cidade.uf.ufSigla = :uf)

    """)
    List<Sede> findByUf(String uf);

    List<Sede> findByAtiva(Boolean ativa);
}
