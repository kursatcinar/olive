package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.Product;
import com.kursatcinar.olive.model.ProductCategory;

import java.util.Optional;

public interface ProductService extends CrudService<Product, Long> {
    Optional<Product> findByName(String name);
    Optional<Product> findByPrice(Double price);
    Optional<Product> findByCategory(ProductCategory productCategory);
}
