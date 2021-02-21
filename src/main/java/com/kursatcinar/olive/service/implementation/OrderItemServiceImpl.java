package com.kursatcinar.olive.service.implementation;

import com.kursatcinar.olive.model.OrderItem;
import com.kursatcinar.olive.model.Orders;
import com.kursatcinar.olive.model.Product;
import com.kursatcinar.olive.repository.OrderItemRepository;
import com.kursatcinar.olive.service.OrderItemService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    private final OrderItemRepository orderItemRepository;

    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public Optional<OrderItem> findByProduct(Product product) {
        return orderItemRepository.findByProduct(product);
    }

    @Override
    public Optional<OrderItem> findByAmount(Integer amount) {
        return orderItemRepository.findByAmount(amount);
    }

    @Override
    public Optional<OrderItem> findByOrders(Orders orders) {
        return orderItemRepository.findByOrders(orders);
    }

    @Override
    public Set<OrderItem> findAll() {
        Set<OrderItem> orderItemSet = new HashSet<>();
        orderItemRepository.findAll().forEach(orderItemSet::add);
        return orderItemSet;
    }

    @Override
    public OrderItem findById(Long aLong) {
        return orderItemRepository.findById(aLong).orElse(null);
    }

    @Override
    public OrderItem save(OrderItem object) {
        return orderItemRepository.save(object);
    }

    @Override
    public void delete(OrderItem object) {
        orderItemRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        orderItemRepository.deleteById(aLong);
    }
}
