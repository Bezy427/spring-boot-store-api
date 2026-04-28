package com.manning.javapersistence.flightplaner.exceptions;

public class CartNotFoundException extends RuntimeException {
    public CartNotFoundException() {
        super("Cart not found!");
    }
}
