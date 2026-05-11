package br.com.mam.sgmc.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.mam.sgmc.errors.ResourceNotFoundException;
import br.com.mam.sgmc.model.Membro;
import br.com.mam.sgmc.model.enums.Ativo;
import br.com.mam.sgmc.repository.MembroRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MembroService {
    private final MembroRepository membroRepository;

    public Membro salvarMembro(Membro membro) {
        if (this.membroRepository.findByNome(membro.getNome()) != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Este nome já existe.");
        }
        return membroRepository.save(membro);
    }

    public Membro atualizarMembro(Membro membro, Long id) {
        Membro membroExistente = membroRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Membro não encontrado com ID: " + id));
        
        membroExistente.setNome(membro.getNome());
        membroExistente.setApelido(membro.getApelido());
        membroExistente.setSexo(membro.getSexo());
        membroExistente.setEmail(membro.getEmail());
        membroExistente.setTelefone(membro.getTelefone());
        membroExistente.setDataNascimento(membro.getDataNascimento());
        membroExistente.setEhBatizado(membro.getEhBatizado());
        membroExistente.setTemEscudo(membro.getTemEscudo());
        membroExistente.setAtivo(membro.getAtivo());
        membroExistente.setTamanhoCamisa(membro.getTamanhoCamisa());
        membroExistente.setDataAdmissao(membro.getDataAdmissao());

        return this.membroRepository.save(membroExistente);
    }

    public List<Membro> listarMembros() {
        return this.membroRepository.findAll();
    }

    public Membro buscarPorId(Long id) {
        return this.membroRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Este id do membro não existe!"));
    }

    public void inativarMembro(Long id) {
        Membro membro = this.buscarPorId(id);
        membro.setAtivo(Ativo.INATIVO.getCodigo());
        this.membroRepository.save(membro);
    }
}
