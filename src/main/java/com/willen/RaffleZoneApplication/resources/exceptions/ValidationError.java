package com.willen.RaffleZoneApplication.resources.exceptions;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError{

    private List<FieldMessage> erros = new ArrayList<>();


    public ValidationError() {
    }

    public ValidationError(Instant timeInstant, Integer status, String error, String message, String path) {
        super(timeInstant, status, error, message, path);
    }

    public ValidationError(Instant timeInstant, Integer status, String error, String path) {
        super(timeInstant, status, error, path);
    }

    public List<FieldMessage> getErros() {
        return erros;
    }

    public void addErrors(String fieldName, String message) {
        this.erros.add(new FieldMessage(fieldName, message));
    }
}
