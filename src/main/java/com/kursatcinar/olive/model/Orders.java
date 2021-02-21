package com.kursatcinar.olive.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Orders")
@Table(name = "orders")
public class Orders extends BaseEntity{

    @Builder
    public Orders(Long id, Customer customer, List<OrderItem> orderItemList, Timestamp orderDate) {
        super(id);
        this.customer = customer;
        this.orderItemList = orderItemList;
        this.orderDate = orderDate;
    }

    @NotNull
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Customer customer;

    @OneToMany(mappedBy = "orders", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<OrderItem> orderItemList;

    @NotNull
    @Column(nullable = false)
    private Timestamp orderDate;
}
