package com.kursatcinar.olive.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "Product")
@Table(name = "product")
public class Product extends BaseEntity{

    @Builder
    public Product(Long id, String name, ProductCategory category, Double price) {
        super(id);
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Column(name = "name")
    private String name;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private ProductCategory category;

    @Column(name = "price")
    private Double price;

}
