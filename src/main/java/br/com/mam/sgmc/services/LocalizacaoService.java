package br.com.mam.sgmc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.mam.sgmc.api.dto.response.CidadeResponseDTO;
import br.com.mam.sgmc.api.dto.response.PaisResponseDTO;
import br.com.mam.sgmc.api.dto.response.UfResponseDTO;
import br.com.mam.sgmc.model.localizacao.Cidade;
import br.com.mam.sgmc.model.localizacao.Pais;
import br.com.mam.sgmc.model.localizacao.Uf;
import br.com.mam.sgmc.repository.CidadeRepository;
import br.com.mam.sgmc.repository.PaisRepository;
import br.com.mam.sgmc.repository.UfRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LocalizacaoService {

    private final PaisRepository paisRepository;
    private final UfRepository ufRepository;
    private final CidadeRepository cidadeRepository;

    public List<Pais> listarPaisesComFiltros(String sigla, String nome, String continente) {
        return paisRepository.findWithFilters(sigla, nome, continente);
    }

    public List<Uf> listarUfsComFiltros(String sigla, String nome, String regiao, String pais) {
        return ufRepository.findWithFilters(sigla, nome, regiao, pais);
    }

    public List<Cidade> listarCidadesComFiltros(String ufSigla, String nome, String pais) {
        return cidadeRepository.findWithFilters(ufSigla, nome, pais);
    }

}
