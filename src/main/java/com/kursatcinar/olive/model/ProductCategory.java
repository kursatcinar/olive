package com.kursatcinar.olive.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "ProductCategory")
@Table(name = "product_category")
public class ProductCategory extends BaseEntity implements Comparable<ProductCategory>{

    @Builder
    public ProductCategory(Long id, String name, ProductCategory parentCategory) {
        super(id);
        this.name = name;
        this.parentCategory = parentCategory;
    }

    @NotNull
    @Column(nullable = false)
    private String name;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    private ProductCategory parentCategory;

    @Override
    public int compareTo(ProductCategory productCategory) {
        int last = (int) (this.getId() - productCategory.getId());
        //Sorting by first name if last name is same d
        return last == 0 ? this.getName().compareTo(productCategory.getName()) : last;
    }
}
