package com.manning.javapersistence.flightplaner.payments;

import com.manning.javapersistence.flightplaner.entities.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PaymentResult {
    private Long orderId;
    private PaymentStatus paymentStatus;
}
