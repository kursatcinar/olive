package com.kursatcinar.olive.service.implementation;

import com.kursatcinar.olive.model.Customer;
import com.kursatcinar.olive.repository.CustomerRepository;
import com.kursatcinar.olive.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findByTckn(String tckn) {
        return customerRepository.findByTckn(tckn);
    }

    @Override
    public Customer findByFirstName(String firstName) {
        return customerRepository.findByFirstName(firstName);
    }

    @Override
    public Customer findByLastName(String lastName) {
        return customerRepository.findByLastName(lastName);
    }

    @Override
    public Customer findByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    @Override
    public Set<Customer> findAll() {
        Set<Customer> customerSet = new HashSet<>();
        customerRepository.findAll().forEach(customerSet::add);
        return customerSet;
    }

    @Override
    public Customer findById(Long aLong) {
        return customerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Customer save(Customer object) {
        return customerRepository.save(object);
    }

    @Override
    public void delete(Customer object) {
        customerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        customerRepository.deleteById(aLong);
    }
}
