package com.kursatcinar.olive.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "OrderItem")
@Table(name = "order_item")
public class OrderItem extends BaseEntity{

    @Builder
    public OrderItem (Long id, Product product, Integer amount, Orders orders) {
        super(id);
        this.product = product;
        this.amount = amount;
        this.orders = orders;
    }

    @NotNull
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Product product;

    @NotNull
    @Column(nullable = false)
    private Integer amount;

    @NotNull
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Orders orders;

}
