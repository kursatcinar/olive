package com.kursatcinar.olive.service.implementation;

import com.kursatcinar.olive.model.Country;
import com.kursatcinar.olive.model.Customer;
import com.kursatcinar.olive.model.Telephone;
import com.kursatcinar.olive.repository.TelephoneRepository;
import com.kursatcinar.olive.service.TelephoneService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class TelephoneServiceImpl implements TelephoneService {

    private final TelephoneRepository telephoneRepository;

    public TelephoneServiceImpl(TelephoneRepository telephoneRepository) {
        this.telephoneRepository = telephoneRepository;
    }

    @Override
    public Optional<Telephone> findByTitle(String title) {
        return telephoneRepository.findByTitle(title);
    }

    @Override
    public Optional<Telephone> findByCountry(Country country) {
        return telephoneRepository.findByCountry(country);
    }

    @Override
    public Optional<Telephone> findByAreaCode(String areaCode) {
        return telephoneRepository.findByAreaCode(areaCode);
    }

    @Override
    public Optional<Telephone> findByPhoneNumber(String phoneNumber) {
        return telephoneRepository.findByPhoneNumber(phoneNumber);
    }

    @Override
    public Optional<Telephone> findByPrimaryFlag(Boolean primaryFlag) {
        return telephoneRepository.findByPrimaryFlag(primaryFlag);
    }

    @Override
    public Optional<Telephone> findByCustomer(Customer customer) {
        return telephoneRepository.findByCustomer(customer);
    }

    @Override
    public Set<Telephone> findAll() {
        Set<Telephone> telephoneSet = new HashSet<>();
        telephoneRepository.findAll().forEach(telephoneSet::add);
        return telephoneSet;
    }

    @Override
    public Telephone findById(Long aLong) {
        return telephoneRepository.findById(aLong).orElse(null);
    }

    @Override
    public Telephone save(Telephone object) {
        return telephoneRepository.save(object);
    }

    @Override
    public void delete(Telephone object) {
        telephoneRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        telephoneRepository.deleteById(aLong);
    }
}
