package com.santander.addressregistration.core.application.service.mapper;

import com.santander.addressregistration.core.domain.entity.Endereco;
import com.santander.addressregistration.core.domain.model.EnderecoResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Slf4j
@Component
public class EnderecoMapper {
    public Endereco map(EnderecoResponse response) {
        log.info("Class: EnderecoMapper - method: map");
        return Endereco.builder()
                .cep(Optional.ofNullable(response.getCep()).orElse(""))
                .tipocep(Optional.ofNullable(response.getTipoCep()).orElse(""))
                .subtipocep(Optional.ofNullable(response.getSubTipoCep()).orElse(""))
                .uf(Optional.ofNullable(response.getUf()).orElse(""))
                .cidade(Optional.ofNullable(response.getCidade()).orElse(""))
                .bairro(Optional.ofNullable(response.getBairro()).orElse(""))
                .endereco(Optional.ofNullable(response.getEndereco()).orElse(""))
                .numero(Optional.ofNullable(response.getNumero()).orElse(""))
                .complemento(Optional.ofNullable(response.getComplemento()).orElse(""))
                .codigoibge(Optional.ofNullable(response.getCodigoIBGE()).orElse(""))
                .build();

    }
}
