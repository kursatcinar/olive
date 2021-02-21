package com.kursatcinar.olive.service.implementation;

import com.kursatcinar.olive.model.ProductCategory;
import com.kursatcinar.olive.repository.ProductCategoryRepository;
import com.kursatcinar.olive.service.ProductCategoryService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    private final ProductCategoryRepository productCategoryRepository;

    public ProductCategoryServiceImpl(ProductCategoryRepository productCategoryRepository) {
        this.productCategoryRepository = productCategoryRepository;
    }

    @Override
    public Optional<ProductCategory> findByName(String name) {
        return productCategoryRepository.findByName(name);
    }

    @Override
    public Optional<ProductCategory> findByParentCategory(ProductCategory parentCategory) {
        return productCategoryRepository.findByParentCategory(parentCategory);
    }

    @Override
    public Set<ProductCategory> findAll() {
        Set<ProductCategory> productCategorySet = new HashSet<>();
        productCategoryRepository.findAll().forEach(productCategorySet::add);
        return productCategorySet;
    }

    @Override
    public ProductCategory findById(Long aLong) {
        return productCategoryRepository.findById(aLong).orElse(null);
    }

    @Override
    public ProductCategory save(ProductCategory object) {
        return productCategoryRepository.save(object);
    }

    @Override
    public void delete(ProductCategory object) {
        productCategoryRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        productCategoryRepository.deleteById(aLong);
    }
}
