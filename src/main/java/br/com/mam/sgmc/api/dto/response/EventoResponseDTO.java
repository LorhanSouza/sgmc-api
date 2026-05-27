package br.com.mam.sgmc.api.dto.response;

import java.time.Instant;

import br.com.mam.sgmc.model.Evento;
import br.com.mam.sgmc.model.localizacao.Local;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventoResponseDTO {
    private Long id;
    private String nome;
    private String descricao;
    private Instant dataInicio;
    private Instant dataFim;
    private Float valor;
    private Local local;

    public static EventoResponseDTO toResponseDTO(Evento evento) {
        return new EventoResponseDTO(
            evento.getId(),
            evento.getNome(),
            evento.getDescricao(),
            evento.getDataInicio(),
            evento.getDataFim(),
            evento.getValor(),
            evento.getLocal()
        );
    }
}
