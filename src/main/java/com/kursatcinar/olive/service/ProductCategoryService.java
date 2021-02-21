package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.ProductCategory;

import java.util.Optional;

public interface ProductCategoryService extends CrudService<ProductCategory, Long> {
    Optional<ProductCategory> findByName(String name);
    Optional<ProductCategory> findByParentCategory(ProductCategory parentCategory);
}
