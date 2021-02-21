package com.kursatcinar.olive.model;

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

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    @Column(name = "amount")
    private Integer amount;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Orders orders;

}
