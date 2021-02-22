package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.Product;
import com.kursatcinar.olive.model.ProductCategory;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
    Product findByName(String name);
    Product findByPrice(Double price);
    Product findByCategory(ProductCategory productCategory);
}
