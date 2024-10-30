package com.santander.addressregistration.api.rest;

import com.santander.addressregistration.core.application.service.SearchZipcodeService;
import com.santander.addressregistration.core.domain.model.EnderecoResponse;
import com.santander.addressregistration.shared.exception.AddressRegistrationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class AddressRegistrationController implements AddressRegistrationAPI {

    private SearchZipcodeService service;

    public AddressRegistrationController(SearchZipcodeService service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<EnderecoResponse> searchZipCode(String zipcode) throws AddressRegistrationException {
        log.info("Class: AddressRegistrationController - method: searchZipcode - zipcode: {} ", zipcode);
        return ResponseEntity.ok().body(service.searchZipcode(zipcode));
    }

}
