package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.Product;
import com.kursatcinar.olive.model.ProductCategory;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {
    Optional<Product> findByName(String name);
    Optional<Product> findByPrice(Double price);
    Optional<Product> findByCategory(ProductCategory productCategory);
}
