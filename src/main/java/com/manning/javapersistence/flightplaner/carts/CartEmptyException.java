package com.manning.javapersistence.flightplaner.carts;

public class CartEmptyException extends RuntimeException {
    public CartEmptyException() {
        super("Cart is empty!");
    }
}
