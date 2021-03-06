package com.thushima.ecommerce.config;

import com.thushima.ecommerce.streaming.CheckoutCreatedSource;
import com.thushima.ecommerce.streaming.PaymentPaidSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class,
        PaymentPaidSink.class
})
public class StreamingConfig {
}
