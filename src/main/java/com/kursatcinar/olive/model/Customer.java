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
    public Customer(Long id, String firstName, String lastName,
                    List<Address> addressList, List<Telephone> telephoneList,
                    String email, String tckn) {
        super(id, firstName, lastName, email);
        this.addressList = addressList;
        this.telephoneList = telephoneList;
        this.tckn = tckn;
    }

    @OneToMany(mappedBy = "customer", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "customer_id")
    private List<Address> addressList;

    @OneToMany(mappedBy = "customer", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "customer_id")
    private List<Telephone> telephoneList;

    @Column(name = "tckn")
    private String tckn;
}
