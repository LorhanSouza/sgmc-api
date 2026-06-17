package br.com.mam.sgmc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mam.sgmc.model.Posse;
import br.com.mam.sgmc.model.pk.PossePk;

public interface PosseRepository extends JpaRepository<Posse, PossePk> {
}
