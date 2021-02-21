package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.OrderItem;
import com.kursatcinar.olive.model.Orders;
import com.kursatcinar.olive.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OrderItemRepository extends CrudRepository<OrderItem, Long> {

    Optional<OrderItem> findByProduct (Product product);
    Optional<OrderItem> findByAmount (Integer amount);
    Optional<OrderItem> findByOrders (Orders orders);
}
