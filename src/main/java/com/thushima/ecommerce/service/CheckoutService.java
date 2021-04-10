package com.thushima.ecommerce.service;

import com.thushima.ecommerce.entity.CheckoutEntity;
import com.thushima.ecommerce.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
