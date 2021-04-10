package com.thushima.ecommerce.listener;

import com.thushima.ecommerce.entity.CheckoutEntity;
import com.thushima.ecommerce.service.CheckoutService;
import com.thushima.ecommerce.streaming.PaymentPaidSink;
import com.thushima.ecommerce.payment.event.PaymentCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentPaidListener {

    private final CheckoutService checkoutService;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent paymentCreatedEvent) {
        checkoutService.updateStatus(paymentCreatedEvent.getCheckoutCode().toString(), CheckoutEntity.Status.APPROVED);
    }
}
