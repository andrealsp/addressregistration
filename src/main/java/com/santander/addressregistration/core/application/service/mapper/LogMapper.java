package com.santander.addressregistration.core.application.service.mapper;

import com.santander.addressregistration.core.domain.entity.Log;
import com.santander.addressregistration.core.domain.model.EnderecoResponse;
import com.santander.addressregistration.shared.constant.GetTimestamp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Slf4j
@Component
public class LogMapper {
    public Log map(EnderecoResponse response) {
        log.info("Class: LogMapper - method: map");
        return Log.builder()
                .datetime(GetTimestamp.getTimestamp())
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
                .sucesso(response.isSucesso())
                .build();
    }

}
