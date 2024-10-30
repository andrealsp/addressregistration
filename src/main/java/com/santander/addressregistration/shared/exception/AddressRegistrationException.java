package com.santander.addressregistration.shared.exception;

import com.santander.addressregistration.shared.constant.GetTimestamp;
import feign.FeignException;
import lombok.Getter;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
public class AddressRegistrationException extends Throwable {

    private static final long serialVersionUID = 1L;
    private Integer errorCode;
    private String message;
    private Timestamp timestamp;
    private String traceId;

    public AddressRegistrationException(FeignException feignException) {
        this.errorCode = feignException.status();
        this.message = feignException.getMessage();
        this.timestamp = GetTimestamp.getTimestamp();
        this.traceId = setTraceId();
    }

    private String setTraceId() {
        return UUID.randomUUID().toString();
    }

}
