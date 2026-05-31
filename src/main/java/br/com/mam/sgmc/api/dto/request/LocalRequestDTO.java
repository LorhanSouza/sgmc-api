package br.com.mam.sgmc.api.dto.request;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocalRequestDTO {
    private String nome;
    private String endereco;
    private String bairro;
    private String numero;
    private String codigoPostal;
    private String contato;
    private Integer capacidade;
    private String cidade;
    private String provinciaEstado;
    private String pais;
}
