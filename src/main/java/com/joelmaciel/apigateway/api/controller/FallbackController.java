package com.joelmaciel.apigateway.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    public static final String ORDER_SERVICE_IS_DOWN = "Order Service is down!";
    public static final String PRODUCT_SERVICE_IS_DOWN = "Product Service is down!";
    public static final String PAYMENT_SERVICE_IS_DOWN = "Payment Service is down!";

    @GetMapping("/orderServiceFallBack")
    public String orderServiceFallBack() {
        return ORDER_SERVICE_IS_DOWN;
    }

    @GetMapping("/productServiceFallBack")
    public String productServiceFallBack() {
        return PRODUCT_SERVICE_IS_DOWN;
    }

    @GetMapping("/paymentServiceFallBack")
    public String paymentServiceFallBack() {
        return PAYMENT_SERVICE_IS_DOWN;
    }
}
