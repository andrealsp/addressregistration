package com.santander.addressregistration.core.application.service.log;

import com.santander.addressregistration.core.application.service.mapper.EnderecoMapper;
import com.santander.addressregistration.core.application.service.mapper.LogMapper;
import com.santander.addressregistration.core.domain.model.EnderecoResponse;
import com.santander.addressregistration.infrastructure.persistence.postgres.EnderecoRepository;
import com.santander.addressregistration.infrastructure.persistence.postgres.LogsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LogServiceImpl implements LogService {

    private EnderecoRepository enderecoRepository;
    private EnderecoMapper enderecoMapper;

    private LogsRepository logsRepository;
    private LogMapper logMapper;

    public LogServiceImpl(EnderecoRepository enderecoRepository,
                          EnderecoMapper enderecoMapper,
                          LogsRepository logsRepository,
                          LogMapper logMapper) {
        this.enderecoRepository = enderecoRepository;
        this.enderecoMapper = enderecoMapper;
        this.logsRepository = logsRepository;
        this.logMapper = logMapper;
    }

    @Override
    public EnderecoResponse log(EnderecoResponse enderecoResponse) {
        log.info("Class: LogServiceImpl - method: log");
        if (enderecoResponse.isSucesso()) {
            logsRepository.save(logMapper.map(enderecoResponse));
            enderecoRepository.save(enderecoMapper.map(enderecoResponse));
        } else {
            logsRepository.save(logMapper.map(enderecoResponse));
        }
        return enderecoResponse;
    }

}
