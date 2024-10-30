package com.santander.addressregistration.core.domain.entity;

import com.santander.addressregistration.core.domain.model.EnderecoResponse;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "enderecos")
@Entity(name = "Endereco")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

    public Endereco(EnderecoResponse endereco) {
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
    }

}
