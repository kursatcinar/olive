package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.Customer;
import com.kursatcinar.olive.model.Orders;
import org.springframework.data.repository.CrudRepository;

import java.sql.Timestamp;

public interface OrdersRepository extends CrudRepository<Orders, Long> {
    Orders findByCustomer (Customer customer);
    Orders findByOrderDate (Timestamp orderDate);
}
