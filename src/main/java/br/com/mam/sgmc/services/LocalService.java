package br.com.mam.sgmc.services;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import br.com.mam.sgmc.model.localizacao.Local;
import br.com.mam.sgmc.repository.LocalRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LocalService {

    private final LocalRepository localRepository;

    @Transactional
    public Local criarLocal(Local local) {
        if (this.localRepository.findByCodigoPostal(local.getCodigoPostal()) != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Este local com o código postal já existe.");
        }
        return this.localRepository.save(local);
    }
}
