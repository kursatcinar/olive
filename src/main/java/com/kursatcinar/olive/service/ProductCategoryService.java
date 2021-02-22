package com.kursatcinar.olive.service;

import com.kursatcinar.olive.model.ProductCategory;

import java.util.Set;

public interface ProductCategoryService extends CrudService<ProductCategory, Long> {
    ProductCategory findByName(String name);
    Set<ProductCategory> findByParentCategory(ProductCategory parentCategory);
}
