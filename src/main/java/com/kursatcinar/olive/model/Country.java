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
@Entity(name = "Country")
@Table(name = "country")
public class Country extends BaseEntity {

    @Builder
    public Country(Long id, String name, String plateCode, String phoneCode) {
        super(id);
        this.name = name;
        this.plateCode = plateCode;
        this.phoneCode = phoneCode;
    }

    @NotNull
    @Column(nullable = false)
    private String name;

    private String plateCode;

    private String phoneCode;
}
