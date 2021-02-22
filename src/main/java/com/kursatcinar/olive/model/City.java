package com.kursatcinar.olive.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "City")
@Table(name = "city")
public class City extends BaseEntity{

    @Builder
    public City (Long id, String name, String plateCode) {
        super(id);
        this.name = name;
        this.plateCode = plateCode;
    }

    @NotNull
    @Column(nullable = false)
    private String name;

    @NotNull
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Country country;

    private String plateCode;

}
