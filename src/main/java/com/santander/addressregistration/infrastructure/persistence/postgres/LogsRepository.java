package com.santander.addressregistration.infrastructure.persistence.postgres;

import com.santander.addressregistration.core.domain.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogsRepository extends JpaRepository<Log, Long> {
}
