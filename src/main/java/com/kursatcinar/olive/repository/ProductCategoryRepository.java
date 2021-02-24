package com.kursatcinar.olive.repository;

import com.kursatcinar.olive.model.ProductCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Set;

public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Long> {

    ProductCategory findByName(String name);
    Set<ProductCategory> findByParentCategory(ProductCategory parentCategory);
}
