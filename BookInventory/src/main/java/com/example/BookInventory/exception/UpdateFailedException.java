package com.example.BookInventory.exception;

public class UpdateFailedException extends RuntimeException {

    public UpdateFailedException(String message) {
        super(message);
    }
}
