package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.Product;
import com.kursatcinar.olive.model.ProductCategory;
import com.kursatcinar.olive.model.UnitOfMeasure;

public interface ProductService extends CrudService<Product, Long> {
    Product findByName(String name);
    Product findByPrice(Double price);
    Product findByCategory(ProductCategory productCategory);
    Product findByQuantity(Double quantity);
    Product findByUnitOfMeasure(UnitOfMeasure unitOfMeasure);
}
