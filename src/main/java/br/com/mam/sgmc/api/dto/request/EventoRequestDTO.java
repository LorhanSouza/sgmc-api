package br.com.mam.sgmc.api.dto.request;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventoRequestDTO {
    private String nome;
    private String descricao;
    private Instant dataInicio;
    private Instant dataFim;
    private Float valor;
    private LocalRequestDTO local;
}
