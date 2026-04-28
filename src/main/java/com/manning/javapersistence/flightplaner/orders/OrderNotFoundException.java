package com.manning.javapersistence.flightplaner.orders;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException() {
        super("Order not found!");
    }
}
