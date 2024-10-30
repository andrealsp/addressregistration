package com.santander.addressregistration.core.domain.entity;

import com.santander.addressregistration.core.domain.model.EnderecoResponse;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Table(name = "logs")
@Entity(name = "Log")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp datetime;
    private String cep;
    private String tipocep;
    private String subtipocep;
    private String uf;
    private String cidade;
    private String bairro;
    private String endereco;
    private String numero;
    private String complemento;
    private String codigoibge;
    private boolean sucesso;

    public Log(EnderecoResponse endereco) {
        this.datetime = endereco.getDatetime();
        this.cep = endereco.getCep();
        this.tipocep = endereco.getTipoCep();
        this.subtipocep = endereco.getSubTipoCep();
        this.uf = endereco.getUf();
        this.cidade = endereco.getCidade();
        this.bairro = endereco.getBairro();
        this.endereco = endereco.getEndereco();
        this.numero = endereco.getNumero();
        this.complemento = endereco.getComplemento();
        this.codigoibge = endereco.getCodigoIBGE();
        this.sucesso = endereco.isSucesso();
    }

}
