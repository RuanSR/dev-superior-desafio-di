package com.ruansr.desafiodi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruansr.desafiodi.models.Order;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public double total(Order order) {

        var basicValue = order.getBasic();

        return basicValue - (basicValue * order.getDiscount() / 100) + shippingService.shipment(order);
    }

}
