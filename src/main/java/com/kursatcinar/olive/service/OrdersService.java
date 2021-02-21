package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.Customer;
import com.kursatcinar.olive.model.Orders;

import java.sql.Timestamp;
import java.util.Optional;

public interface OrdersService extends CrudService<Orders, Long> {
    Optional<Orders> findByCustomer (Customer customer);
    Optional<Orders> findByOrderDate (Timestamp orderDate);
}
