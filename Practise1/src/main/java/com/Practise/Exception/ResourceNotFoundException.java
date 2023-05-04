package com.Practise.Exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException() {
        super("resource Not Found On server!!!!!!");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
