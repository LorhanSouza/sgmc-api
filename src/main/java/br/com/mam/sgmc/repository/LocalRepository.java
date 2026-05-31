package br.com.mam.sgmc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mam.sgmc.model.localizacao.Local;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long> {

    public Local findByCodigoPostal(String codigoPostal);
    
}
