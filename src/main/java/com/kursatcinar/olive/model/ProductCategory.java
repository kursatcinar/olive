package com.kursatcinar.olive.model;

import com.sun.istack.NotNull;
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
    public ProductCategory(Long id, String name, ProductCategory parentCategory, List<ProductCategory> subCategoryList) {
        super(id);
        this.name = name;
        this.parentCategory = parentCategory;
        this.subCategoryList = subCategoryList;
    }

    @NotNull
    @Column(nullable = false)
    private String name;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    private ProductCategory parentCategory;

    @OneToMany(cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "parent_id")
    private List<ProductCategory> subCategoryList;
}
