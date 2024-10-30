package com.santander.addressregistration.core.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

import java.sql.Timestamp;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorTemplate {

    private Integer errorCode;
    private String message;
    private Timestamp timestamp;
    private String traceId;

}
