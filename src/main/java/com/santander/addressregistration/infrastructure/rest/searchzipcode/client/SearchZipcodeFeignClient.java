package com.santander.addressregistration.infrastructure.rest.searchzipcode.client;

import com.santander.addressregistration.core.domain.model.EnderecoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "searchzipcode", url = "${webservice.rest.searchzipcode.uri}")
public interface SearchZipcodeFeignClient {

    @GetMapping(value = "/cep/{zipcode}")
    EnderecoResponse searchZipcode(@PathVariable String zipcode);

}
