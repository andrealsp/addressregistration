package com.santander.addressregistration.infrastructure.rest.searchzipcode;

import com.santander.addressregistration.core.application.service.log.LogService;
import com.santander.addressregistration.core.domain.model.EnderecoResponse;
import com.santander.addressregistration.infrastructure.rest.searchzipcode.client.SearchZipcodeFeignClient;
import com.santander.addressregistration.shared.exception.AddressRegistrationException;
import feign.FeignException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SearchZipcodeRest implements SearchZipcodePortOut {

    private SearchZipcodeFeignClient client;
    private LogService logService;

    public SearchZipcodeRest(SearchZipcodeFeignClient client,
                             LogService logService) {
        this.client = client;
        this.logService = logService;
    }

    @Override
    public EnderecoResponse searchZipcode(String zipcode) throws AddressRegistrationException {
        log.info("Class: SearchZipcodeRest - method: searchZipcode - zipcode: {} ", zipcode);
        try {
            return client.searchZipcode(zipcode);
        } catch (FeignException.FeignClientException feignException) {
            log.error("zipcode: {} presented error.", zipcode);
            var enderecoResponse = new EnderecoResponse();
            enderecoResponse.setCep(zipcode);
            enderecoResponse.setSucesso(false);

            logService.log(enderecoResponse);
            throw new AddressRegistrationException(feignException);
        }
    }
}
