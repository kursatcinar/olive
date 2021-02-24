package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.Product;
import com.kursatcinar.olive.model.ProductCategory;
import com.kursatcinar.olive.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
    Product findByName(String name);
    Product findByPrice(Double price);
    Product findByCategory(ProductCategory productCategory);
    Product findByQuantity(Double quantity);
    Product findByUnitOfMeasure(UnitOfMeasure unitOfMeasure);
}
