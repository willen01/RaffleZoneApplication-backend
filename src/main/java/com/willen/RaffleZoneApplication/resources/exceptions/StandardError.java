package com.willen.RaffleZoneApplication.resources.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant timeInstant;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandardError() {
    }

    public StandardError(Instant timeInstant, Integer status, String error, String message, String path) {
        this.timeInstant = timeInstant;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public StandardError(Instant timeInstant, Integer status, String error, String path) {
        this.timeInstant = timeInstant;
        this.status = status;
        this.error = error;
        this.path = path;
    }

    public Instant getTimeInstant() {
        return timeInstant;
    }

    public void setTimeInstant(Instant timeInstant) {
        this.timeInstant = timeInstant;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
