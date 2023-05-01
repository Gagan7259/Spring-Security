package com.UserRating.Exception;

public class ResorceNotFoundException extends RuntimeException {
    public ResorceNotFoundException() {
        super("Resorce Not found on server !!");
    }

    public ResorceNotFoundException(String message) {
        super(message);
    }
}
