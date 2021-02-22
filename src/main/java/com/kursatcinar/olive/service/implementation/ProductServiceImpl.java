package com.kursatcinar.olive.service.implementation;

import com.kursatcinar.olive.model.Product;
import com.kursatcinar.olive.model.ProductCategory;
import com.kursatcinar.olive.repository.ProductRepository;
import com.kursatcinar.olive.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public Product findByPrice(Double price) {
        return productRepository.findByPrice(price);
    }

    @Override
    public Product findByCategory(ProductCategory productCategory) {
        return productRepository.findByCategory(productCategory);
    }

    @Override
    public Set<Product> findAll() {
        Set<Product> productSet = new HashSet<>();
        productRepository.findAll().forEach(productSet::add);
        return productSet;
    }

    @Override
    public Product findById(Long aLong) {
        return productRepository.findById(aLong).orElse(null);
    }

    @Override
    public Product save(Product object) {
        return productRepository.save(object);
    }

    @Override
    public void delete(Product object) {
        productRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        productRepository.deleteById(aLong);
    }
}
