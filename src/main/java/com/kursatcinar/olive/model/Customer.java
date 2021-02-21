package com.kursatcinar.olive.model;

import javax.persistence.*;
import java.util.List;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Customer")
@Table(name = "customer")
public class Customer extends Person{

    @Builder
    public Customer(Long id, String firstName, String lastName, String email,
                    List<Address> addressList, List<Telephone> telephoneList,
                    String tckn, List<Orders> ordersList) {
        super(id, firstName, lastName, email);
        this.addressList = addressList;
        this.telephoneList = telephoneList;
        this.tckn = tckn;
        this.ordersList = ordersList;
    }

    @OneToMany(mappedBy = "customer", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Address> addressList;

    @OneToMany(mappedBy = "customer", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Telephone> telephoneList;

    private String tckn;

    @OneToMany(mappedBy = "customer", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Orders> ordersList;
}
