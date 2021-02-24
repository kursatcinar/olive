package com.kursatcinar.olive.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="UnitOfMeasure")
@Table(name = "unit_of_measure")
public class UnitOfMeasure extends BaseEntity {

    public UnitOfMeasure(Long id, String name, UnitOfMeasureType type, String abbreviation) {
        super(id);
        this.name = name;
        this.type = type;
        this.abbreviation = abbreviation;
    }

    @NotNull
    @Column(nullable = false)
    String name;

    @NotNull
    @Column(nullable = false)
    UnitOfMeasureType type;

    @NotNull
    @Column(nullable = false)
    String abbreviation;
}
