package com.kursatcinar.olive.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "Administrator")
@Table(name = "administrator")
public class Administrator extends Person {

    @Builder
    public Administrator(Long id, String firstName, String lastName,
                    List<Address> addressList, List<Telephone> telephoneList,
                    String email) {
        super(id, firstName, lastName, email);
    }
}
