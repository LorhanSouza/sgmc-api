package br.com.mam.sgmc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mam.sgmc.model.localizacao.Local;

public interface LocalRepository extends JpaRepository<Local, Long> {

    public Local findByCodigoPostal(String codigoPostal);
    
}
