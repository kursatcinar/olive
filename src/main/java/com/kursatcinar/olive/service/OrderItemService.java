package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.OrderItem;
import com.kursatcinar.olive.model.Orders;
import com.kursatcinar.olive.model.Product;

import java.util.Optional;

public interface OrderItemService extends CrudService<OrderItem, Long> {

    Optional<OrderItem> findByProduct (Product product);
    Optional<OrderItem> findByAmount (Integer amount);
    Optional<OrderItem> findByOrders (Orders orders);
}
