package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.Product;
import com.kursatcinar.olive.model.ProductCategory;

public interface ProductService extends CrudService<Product, Long> {
    Product findByName(String name);
    Product findByPrice(Double price);
    Product findByCategory(ProductCategory productCategory);
}
