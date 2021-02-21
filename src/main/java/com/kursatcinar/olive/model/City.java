package com.kursatcinar.olive.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "City")
@Table(name = "city")
public class City extends BaseEntity{

    @Builder
    public City (Long id, String name, String plateCode, List<District> districtList) {
        super(id);
        this.name = name;
        this.plateCode = plateCode;
        this.districtList = districtList;
    }

    private String name;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Country country;

    private String plateCode;

    @OneToMany(mappedBy = "city", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<District> districtList;


}
