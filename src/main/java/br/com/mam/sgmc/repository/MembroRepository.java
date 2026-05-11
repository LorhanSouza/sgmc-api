package br.com.mam.sgmc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.mam.sgmc.model.Membro;

public interface MembroRepository extends JpaRepository<Membro, Long> {
    Membro findByNome(String nome);
}
