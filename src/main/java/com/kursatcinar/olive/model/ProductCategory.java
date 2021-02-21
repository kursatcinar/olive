package com.kursatcinar.olive.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "ProductCategory")
@Table(name = "product_category")
public class ProductCategory extends BaseEntity{

    @Builder
    public ProductCategory(Long id, String name,ProductCategory superCategory, List<ProductCategory> subCategoryList) {
        super(id);
        this.name = name;
        this.superCategory = superCategory;
        this.subCategoryList = subCategoryList;
    }

    private String name;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    private ProductCategory superCategory;

    @OneToMany(cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "parent_id")
    private List<ProductCategory> subCategoryList;
}
