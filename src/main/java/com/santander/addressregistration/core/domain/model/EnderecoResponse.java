package com.santander.addressregistration.core.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnderecoResponse {

    private Long id;
    @NotBlank
    private Timestamp datetime;
    @NotBlank
    private String cep;
    @NotBlank
    private String tipoCep;
    @NotBlank
    private String subTipoCep;
    @NotBlank
    private String uf;
    @NotBlank
    private String cidade;
    @NotBlank
    private String bairro;
    @NotBlank
    private String endereco;
    @NotBlank
    private String numero;
    @NotBlank
    private String complemento;
    @NotBlank
    private String codigoIBGE;

    @JsonIgnore
    private boolean sucesso;

}
