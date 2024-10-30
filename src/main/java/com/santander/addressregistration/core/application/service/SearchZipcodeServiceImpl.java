package com.santander.addressregistration.core.application.service;

import com.santander.addressregistration.core.application.service.log.LogService;
import com.santander.addressregistration.core.domain.model.EnderecoResponse;
import com.santander.addressregistration.infrastructure.persistence.postgres.EnderecoRepository;
import com.santander.addressregistration.infrastructure.rest.searchzipcode.SearchZipcodePortOut;
import com.santander.addressregistration.shared.exception.AddressRegistrationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SearchZipcodeServiceImpl implements SearchZipcodeService {

    private SearchZipcodePortOut rest;
    private EnderecoRepository endereco;
    private LogService logService;

    public SearchZipcodeServiceImpl(SearchZipcodePortOut rest,
                                    EnderecoRepository endereco,
                                    LogService logService) {
        this.rest = rest;
        this.endereco = endereco;
        this.logService = logService;
    }

    @Override
    public EnderecoResponse searchZipcode(String zipcode) throws AddressRegistrationException {
        log.info("Class: SearchZipcodeServiceImpl - method: searchZipcode - zipcode: {} ", zipcode);
        var enderecoResponse = rest.searchZipcode(zipcode);
        enderecoResponse.setSucesso(true);
        return logService.log(enderecoResponse);
    }
}
