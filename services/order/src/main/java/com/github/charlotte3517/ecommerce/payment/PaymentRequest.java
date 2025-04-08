package com.github.charlotte3517.ecommerce.payment;

import com.github.charlotte3517.ecommerce.customer.CustomerResponse;
import com.github.charlotte3517.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
