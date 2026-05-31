package br.com.mam.sgmc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.mam.sgmc.model.Evento;
import br.com.mam.sgmc.model.localizacao.Local;
import br.com.mam.sgmc.repository.EventoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventoService {

    private final EventoRepository eventoRepository;
    private final LocalService localService;

    public List<Evento> listarEventos(){
        return this.eventoRepository.findAll();
    }

    public Evento criarEvento(Evento evento){
        Local local = this.localService.criarLocal(evento.getLocal());
        evento.setLocal(local);
        return this.eventoRepository.save(evento);
    }

    public void deletarEvento(Long id) {
        this.eventoRepository.deleteById(id);
    }
}
