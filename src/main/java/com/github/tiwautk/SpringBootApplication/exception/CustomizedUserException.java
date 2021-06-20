package com.github.tiwautk.SpringBootApplication.exception;

public class CustomizedUserException extends RuntimeException {
    public CustomizedUserException(String message) {
        super(message);
    }
}
