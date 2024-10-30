package com.santander.addressregistration.api.rest;

import com.santander.addressregistration.core.domain.model.EnderecoResponse;
import com.santander.addressregistration.shared.exception.AddressRegistrationException;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/zipcode")
public interface AddressRegistrationAPI {

    @GetMapping("/{zipcode}")
    @Transactional
    ResponseEntity<EnderecoResponse> searchZipCode(@PathVariable String zipcode) throws AddressRegistrationException;

}
