package com.kursatcinar.olive.controller;

import com.kursatcinar.olive.service.ProductCategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductCategoryController {
    private final ProductCategoryService productCategoryService;

    public ProductCategoryController(ProductCategoryService productCategoryService) {
        this.productCategoryService = productCategoryService;
    }

    @RequestMapping({"/categories","/categories/","/categories/index","/categories/index/","/categories/index.html","categories.html"})
    public String listProductCategories(Model model) {
        model.addAttribute("categories", productCategoryService.findAll());
        return "categories/index";
    }
}
