package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.Customer;
import com.kursatcinar.olive.model.Orders;

import java.sql.Timestamp;

public interface OrdersService extends CrudService<Orders, Long> {
    Orders findByCustomer (Customer customer);
    Orders findByOrderDate (Timestamp orderDate);
}
