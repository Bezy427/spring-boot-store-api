package com.manning.javapersistence.flightplaner.carts;

public class CartNotFoundException extends RuntimeException {
    public CartNotFoundException() {
        super("Cart not found!");
    }
}
