package com.santander.addressregistration.infrastructure.rest.searchzipcode;

import com.santander.addressregistration.core.domain.model.EnderecoResponse;
import com.santander.addressregistration.shared.exception.AddressRegistrationException;

public interface SearchZipcodePortOut {

    EnderecoResponse searchZipcode(String zipcode) throws AddressRegistrationException;

}
