package com.felipe.totalorder.order.services;

import com.felipe.totalorder.order.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public Double total(Order order){
        Double discoutedValue = order.getBasic() - (order.getBasic() * (order.getDiscount() / 100));
        Double shippingCost = shippingService.shipment(order);

        return discoutedValue + shippingCost;
    }
}
