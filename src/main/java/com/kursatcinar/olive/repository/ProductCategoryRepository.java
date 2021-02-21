package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.ProductCategory;
import jdk.jfr.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Long> {

    Optional<ProductCategory> findByName(String name);
    Optional<ProductCategory> findByParentCategory(ProductCategory parentCategory);
}
