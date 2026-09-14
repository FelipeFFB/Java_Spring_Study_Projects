package com.felipebranquinho.desafio1.services;

import com.felipebranquinho.desafio1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

//    public OrderService (ShippingService shippingService){
//        this.shippingService = shippingService;
//    }

    public double total (Order order){

        return order.getBasic()
                * (1 - (order.getDiscount()/100))
                + shippingService.shipment(order);
    }
}
