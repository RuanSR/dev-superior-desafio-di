package com.ruansr.desafiodi.services;

import org.springframework.stereotype.Service;

import com.ruansr.desafiodi.models.Order;

@Service
class ShippingService {

    private final double MIN_VALUE_ROLE_DISCOUNT = 100.00;
    private final double MAX_VALUE_ROLE_DISCOUNT = 200.00;

    private final double SHIPPING_COST_MIN_VALUE = 20.00;
    private final double SHIPPING_COST_EXCLUSIVE_VALUE = 12.00;
    private final double SHIPPING_COST_FREE = 0;

    public double shipment(Order order) {

        var basicValue = order.getBasic();

        if (basicValue < MIN_VALUE_ROLE_DISCOUNT) {
            return SHIPPING_COST_MIN_VALUE;
        }

        if (basicValue >= MIN_VALUE_ROLE_DISCOUNT && basicValue <= MAX_VALUE_ROLE_DISCOUNT) {
            return SHIPPING_COST_EXCLUSIVE_VALUE;
        }

        return SHIPPING_COST_FREE;

    }

}
