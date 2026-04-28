package com.manning.javapersistence.flightplaner.payments;

import com.manning.javapersistence.flightplaner.orders.Order;

import java.util.Optional;

public interface PaymentGateway {
    CheckoutSession createCheckoutSession(Order order);
    Optional<PaymentResult> parseWebhookRequest(WebhookRequest request);
}
