package com.manning.javapersistence.flightplaner.dtos;

import com.manning.javapersistence.flightplaner.entities.Order;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDto {
    private OrderProductDto product;
    private int quantity;
    private BigDecimal totalPrice;

}
