package com.kursatcinar.olive.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.Currency;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "Product")
@Table(name = "product")
public class Product extends BaseEntity{

    @Builder
    public Product(Long id, String name, Double price, Currency currency, ProductCategory category) {
        super(id);
        this.name = name;
        this.price = price;
        this.currency = currency;
        this.category = category;
    }

    @NotNull
    @Column(nullable = false)
    private String name;

    @NotNull
    @Column(nullable = false)
    private Double price;

    @NotNull
    @Column(nullable = false)
    private Currency currency = Currency.getInstance("TRY");

    @NotNull
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ProductCategory category;

    @NotNull
    @Column(nullable = false)
    private Double quantity;

    @NotNull
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private UnitOfMeasure unitOfMeasure;

}
