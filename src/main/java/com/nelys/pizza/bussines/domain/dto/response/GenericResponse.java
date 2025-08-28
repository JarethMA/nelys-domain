package com.nelys.pizza.bussines.domain.dto.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Map;

@Data
@EqualsAndHashCode(callSuper = false)
public class GenericResponse {

    private String codeStatus;
    private String message;

    private Map<String, Object> information;
}
