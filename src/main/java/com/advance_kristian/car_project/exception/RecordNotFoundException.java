package com.advance_kristian.car_project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ThrowNotFoundException extends RuntimeException {

    public ThrowNotFoundException(String message) {
        super(message);
    }
}
