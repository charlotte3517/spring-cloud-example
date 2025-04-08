package com.github.charlotte3517.ecommerce.kafka;

import com.github.charlotte3517.ecommerce.customer.CustomerResponse;
import com.github.charlotte3517.ecommerce.order.PaymentMethod;
import com.github.charlotte3517.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
