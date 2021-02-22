package com.kursatcinar.olive.bootstrap;

import com.kursatcinar.olive.model.ProductCategory;
import com.kursatcinar.olive.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Component
public class OliveBootstrap implements CommandLineRunner {

    private final AddressService addressService;
    private final AdministratorService administratorService;
    private final CityService cityService;
    private final CountryService countryService;
    private final CustomerService customerService;
    private final DistrictService districtService;
    private final OrderItemService orderItemService;
    private final OrdersService ordersService;
    private final ProductCategoryService productCategoryService;
    private final ProductService productService;
    private final TelephoneService telephoneService;

    public OliveBootstrap(AddressService addressService, AdministratorService administratorService, CityService cityService, CountryService countryService, CustomerService customerService, DistrictService districtService, OrderItemService orderItemService, OrdersService ordersService, ProductCategoryService productCategoryService, ProductService productService, TelephoneService telephoneService) {
        this.addressService = addressService;
        this.administratorService = administratorService;
        this.cityService = cityService;
        this.countryService = countryService;
        this.customerService = customerService;
        this.districtService = districtService;
        this.orderItemService = orderItemService;
        this.ordersService = ordersService;
        this.productCategoryService = productCategoryService;
        this.productService = productService;
        this.telephoneService = telephoneService;
    }

    @Override
    public void run(String... args) throws Exception {
        if (productCategoryService.findAll().size() == 0) {
            loadData();
        }
    }

    private void loadData() {
        ProductCategory productCategory1 = new ProductCategory();
        productCategory1.setName("Yağ");
        productCategoryService.save(productCategory1);

        ProductCategory productCategory2 = new ProductCategory();
        productCategory2.setName("Sıvı Yağ");
        productCategory2.setParentCategory(productCategory1);
        productCategoryService.save(productCategory2);

        ProductCategory productCategory3 = new ProductCategory();
        productCategory3.setName("Katı Yağ");
        productCategory3.setParentCategory(productCategory1);
        productCategoryService.save(productCategory3);

        ProductCategory productCategory4 = new ProductCategory();
        productCategory4.setName("Zeytinyağı");
        productCategory4.setParentCategory(productCategory2);
        productCategoryService.save(productCategory4);

        ProductCategory productCategory5 = new ProductCategory();
        productCategory5.setName("Fındık Yağı");
        productCategory5.setParentCategory(productCategory2);
        productCategoryService.save(productCategory5);

        ProductCategory productCategory6 = new ProductCategory();
        productCategory6.setName("Ayçiçek Yağı");
        productCategory6.setParentCategory(productCategory2);
        productCategoryService.save(productCategory6);

        ProductCategory productCategory7 = new ProductCategory();
        productCategory7.setName("Tereyağ");
        productCategory7.setParentCategory(productCategory3);
        productCategoryService.save(productCategory7);

        ProductCategory productCategory8 = new ProductCategory();
        productCategory8.setName("Margarin");
        productCategory8.setParentCategory(productCategory3);
        productCategoryService.save(productCategory8);

        log.info(productCategory1.getName() + ": " + productCategoryService.findByParentCategory(productCategory1).size());
        log.info(productCategory2.getName() + ": " + productCategoryService.findByParentCategory(productCategory2).size());
        log.info(productCategory3.getName() + ": " + productCategoryService.findByParentCategory(productCategory3).size());
    }
}