package com.kursatcinar.olive.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Orders")
@Table(name = "orders")
public class Orders extends BaseEntity{

    @Builder
    public Orders(Long id, Customer customer, Timestamp orderDate) {
        super(id);
        this.customer = customer;
        this.orderDate = orderDate;
    }

    @NotNull
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Customer customer;

    @NotNull
    @Column(nullable = false)
    private Timestamp orderDate;
}
