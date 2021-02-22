package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.OrderItem;
import com.kursatcinar.olive.model.Orders;
import com.kursatcinar.olive.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface OrderItemRepository extends CrudRepository<OrderItem, Long> {

    OrderItem findByProduct (Product product);
    OrderItem findByAmount (Integer amount);
    OrderItem findByOrders (Orders orders);
}
