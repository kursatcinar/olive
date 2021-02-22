package com.kursatcinar.olive.service.implementation;

import com.kursatcinar.olive.model.Customer;
import com.kursatcinar.olive.model.Orders;
import com.kursatcinar.olive.repository.OrdersRepository;
import com.kursatcinar.olive.service.OrdersService;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Service
public class OrdersServiceImpl implements OrdersService {

    private final OrdersRepository ordersRepository;

    public OrdersServiceImpl(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public Orders findByCustomer(Customer customer) {
        return ordersRepository.findByCustomer(customer);
    }

    @Override
    public Orders findByOrderDate(Timestamp orderDate) {
        return ordersRepository.findByOrderDate(orderDate);
    }

    @Override
    public Set<Orders> findAll() {
        Set<Orders> ordersSet = new HashSet<>();
        ordersRepository.findAll().forEach(ordersSet::add);
        return ordersSet;
    }

    @Override
    public Orders findById(Long aLong) {
        return ordersRepository.findById(aLong).orElse(null);
    }

    @Override
    public Orders save(Orders object) {
        return ordersRepository.save(object);
    }

    @Override
    public void delete(Orders object) {
        ordersRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ordersRepository.deleteById(aLong);
    }
}
