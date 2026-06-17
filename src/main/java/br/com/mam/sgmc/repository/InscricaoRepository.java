package br.com.mam.sgmc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mam.sgmc.model.Inscricao;
import br.com.mam.sgmc.model.pk.InscricaoPk;

public interface InscricaoRepository extends JpaRepository<Inscricao, InscricaoPk> {
}
