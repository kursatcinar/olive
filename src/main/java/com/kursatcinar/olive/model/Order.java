package com.kursatcinar.olive.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Order")
@Table(name = "order")
public class Order extends BaseEntity{

    @Builder
    public Order (Long id, Customer customer, List<OrderItem> orderItemList, Date orderDate) {
        super(id);
        this.customer = customer;
        this.orderItemList =orderItemList;
        this.orderDate = orderDate;
    }

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @OneToMany(mappedBy = "order", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_item_id", referencedColumnName = "id")
    private List<OrderItem> orderItemList;

    @Column(name = "order_date")
    private Date orderDate;
}
