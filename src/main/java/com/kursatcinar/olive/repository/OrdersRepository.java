package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.Customer;
import com.kursatcinar.olive.model.OrderItem;
import com.kursatcinar.olive.model.Orders;
import org.springframework.data.repository.CrudRepository;

import java.sql.Timestamp;
import java.util.Optional;

public interface OrdersRepository extends CrudRepository<Orders, Long> {
    Optional<Orders> findByCustomer (Customer customer);
    Optional<Orders> findByOrderDate (Timestamp orderDate);
}
