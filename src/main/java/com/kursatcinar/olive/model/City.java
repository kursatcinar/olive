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

    @Column(name = "name")
    private String name;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;

    @Column(name = "plate_code")
    private String plateCode;

    @OneToMany(mappedBy = "city", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<District> districtList;


}
