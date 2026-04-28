package com.manning.javapersistence.flightplaner.controllers;

import com.manning.javapersistence.flightplaner.dtos.ErrorDto;
import com.manning.javapersistence.flightplaner.dtos.OrderDto;
import com.manning.javapersistence.flightplaner.exceptions.OrderNotFoundException;
import com.manning.javapersistence.flightplaner.repositories.OrderRepository;
import com.manning.javapersistence.flightplaner.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.AccessDeniedException;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    @GetMapping
    public List<OrderDto> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{orderId}")
    public OrderDto getOrder(
            @PathVariable("orderId") Long orderId
    ) {
        return orderService.getOrder(orderId);
    }

    @ExceptionHandler(OrderNotFoundException.class)
    public ResponseEntity<Void> handleOrderNotFound() {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<ErrorDto> handleAccessDenied(Exception e) {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(
                new ErrorDto(e.getMessage())
        );
    }

}
