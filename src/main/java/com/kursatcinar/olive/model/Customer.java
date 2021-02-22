package com.kursatcinar.olive.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Customer")
@Table(name = "customer")
public class Customer extends Person {

    @Builder
    public Customer(Long id, String firstName, String lastName, String email, String tckn) {
        super(id, firstName, lastName, email);
        this.tckn = tckn;
    }

    @NotNull
    @Column(nullable = false)
    private String tckn;
}
