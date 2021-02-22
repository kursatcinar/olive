package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.OrderItem;
import com.kursatcinar.olive.model.Orders;
import com.kursatcinar.olive.model.Product;

public interface OrderItemService extends CrudService<OrderItem, Long> {

    OrderItem findByProduct (Product product);
    OrderItem findByAmount (Integer amount);
    OrderItem findByOrders (Orders orders);
}
