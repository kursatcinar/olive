package com.kursatcinar.olive.service.implementation;

import com.kursatcinar.olive.model.*;
import com.kursatcinar.olive.repository.AddressRepository;
import com.kursatcinar.olive.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Optional<Address> findByTitle(String title) {
        return addressRepository.findByTitle(title);
    }

    @Override
    public Optional<Address> findByCountry(Country country) {
        return addressRepository.findByCountry(country);
    }

    @Override
    public Optional<Address> findByCity(City city) {
        return addressRepository.findByCity(city);
    }

    @Override
    public Optional<Address> findByDistrict(District district) {
        return addressRepository.findByDistrict(district);
    }

    @Override
    public Optional<Address> findByAddress(String address) {
        return addressRepository.findByAddress(address);
    }

    @Override
    public Optional<Address> findByPrimaryFlag(Boolean primaryFlag) {
        return addressRepository.findByPrimaryFlag(primaryFlag);
    }

    @Override
    public Optional<Address> findByCustomer(Customer customer) {
        return addressRepository.findByCustomer(customer);
    }

    @Override
    public Set<Address> findAll() {
        Set<Address> addressSet = new HashSet<>();
        addressRepository.findAll().forEach(addressSet::add);
        return addressSet;
    }

    @Override
    public Address findById(Long aLong) {
        return addressRepository.findById(aLong).orElse(null);
    }

    @Override
    public Address save(Address object) {
        return addressRepository.save(object);
    }

    @Override
    public void delete(Address object) {
        addressRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        addressRepository.deleteById(aLong);
    }
}
