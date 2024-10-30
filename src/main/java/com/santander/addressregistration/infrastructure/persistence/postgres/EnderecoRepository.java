package com.santander.addressregistration.infrastructure.persistence.postgres;

import com.santander.addressregistration.core.domain.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
