package br.com.mam.sgmc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mam.sgmc.model.Cargo;


public interface CargoRepository extends JpaRepository<Cargo, Long> {
    Cargo findByTitulo(String titulo);
}
