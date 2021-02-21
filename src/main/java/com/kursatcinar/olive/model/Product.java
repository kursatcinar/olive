package com.kursatcinar.olive.model;

import com.sun.istack.NotNull;
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
    public Product(Long id, String name, Double price, ProductCategory category) {
        super(id);
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @NotNull
    @Column(nullable = false)
    private String name;

    @NotNull
    @Column(nullable = false)
    private Double price;

    @NotNull
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ProductCategory category;

}
