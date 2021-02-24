package com.kursatcinar.olive.bootstrap;

import com.kursatcinar.olive.model.Product;
import com.kursatcinar.olive.model.ProductCategory;
import com.kursatcinar.olive.model.UnitOfMeasure;
import com.kursatcinar.olive.model.UnitOfMeasureType;
import com.kursatcinar.olive.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Currency;

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
    private final UnitOfMeasureService unitOfMeasureService;

    public OliveBootstrap(AddressService addressService, AdministratorService administratorService, CityService cityService, CountryService countryService, CustomerService customerService, DistrictService districtService, OrderItemService orderItemService, OrdersService ordersService, ProductCategoryService productCategoryService, ProductService productService, TelephoneService telephoneService, UnitOfMeasureService unitOfMeasureService) {
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
        this.unitOfMeasureService = unitOfMeasureService;
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

        log.debug(productCategory1.getName() + ": " + productCategoryService.findByParentCategory(productCategory1).size());
        log.debug(productCategory2.getName() + ": " + productCategoryService.findByParentCategory(productCategory2).size());
        log.debug(productCategory3.getName() + ": " + productCategoryService.findByParentCategory(productCategory3).size());

        UnitOfMeasure unitOfMeasure1 = new UnitOfMeasure();
        unitOfMeasure1.setName("Litre");
        unitOfMeasure1.setType(UnitOfMeasureType.VOLUME);
        unitOfMeasure1.setAbbreviation("L");
        unitOfMeasureService.save(unitOfMeasure1);

        UnitOfMeasure unitOfMeasure2 = new UnitOfMeasure();
        unitOfMeasure2.setName("Mililitre");
        unitOfMeasure2.setType(UnitOfMeasureType.VOLUME);
        unitOfMeasure2.setAbbreviation("ml");
        unitOfMeasureService.save(unitOfMeasure2);

        UnitOfMeasure unitOfMeasure3 = new UnitOfMeasure();
        unitOfMeasure3.setName("Kilogram");
        unitOfMeasure3.setType(UnitOfMeasureType.WEIGHT);
        unitOfMeasure3.setAbbreviation("kg");
        unitOfMeasureService.save(unitOfMeasure3);

        UnitOfMeasure unitOfMeasure4 = new UnitOfMeasure();
        unitOfMeasure4.setName("Gram");
        unitOfMeasure4.setType(UnitOfMeasureType.WEIGHT);
        unitOfMeasure4.setAbbreviation("gr");
        unitOfMeasureService.save(unitOfMeasure4);

        log.info("# of UNIT_OF_MEASURE rows: " + unitOfMeasureService.findAll().size());

        Product product1 = new Product();
        product1.setCategory(productCategory4);
        product1.setCurrency(Currency.getInstance("TRY"));
        product1.setName("Şukela Olea");
        product1.setPrice(100.00);
        product1.setQuantity(500.0);
        product1.setUnitOfMeasure(unitOfMeasure2);
        productService.save(product1);

        Product product2 = new Product();
        product2.setCategory(productCategory4);
        product2.setCurrency(Currency.getInstance("TRY"));
        product2.setName("Victor Olea");
        product2.setPrice(200.00);
        product2.setQuantity(500.0);
        product2.setUnitOfMeasure(unitOfMeasure2);
        productService.save(product2);

        Product product3 = new Product();
        product3.setCategory(productCategory4);
        product3.setCurrency(Currency.getInstance("TRY"));
        product3.setName("Teneke Olea");
        product3.setPrice(300.00);
        product3.setQuantity(2.0);
        product3.setUnitOfMeasure(unitOfMeasure1);
        productService.save(product3);
    }
}