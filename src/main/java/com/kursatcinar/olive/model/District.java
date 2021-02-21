package com.kursatcinar.olive.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "District")
@Table(name = "district")
public class District extends BaseEntity{

    @Builder
    public District(Long id, String name, City city) {
        super(id);
        this.name = name;
        this.city = city;
    }

    private String name;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private City city;


}
