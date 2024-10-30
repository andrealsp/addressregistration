package com.santander.addressregistration.core.application.service;

import com.santander.addressregistration.core.domain.model.EnderecoResponse;
import com.santander.addressregistration.shared.exception.AddressRegistrationException;
import org.springframework.http.ResponseEntity;

public interface SearchZipcodeService {
    EnderecoResponse searchZipcode(String zipcode) throws AddressRegistrationException;
}
