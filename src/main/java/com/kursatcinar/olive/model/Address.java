package com.kursatcinar.olive.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Address")
@Table(name = "address")
public class Address extends BaseEntity{

    @Builder
    public Address (Long id, String title, AddressType addressType, Country country, City city, District district, String address, Boolean primaryFlag, Customer customer) {
        super(id);
        this.title = title;
        this.addressType = addressType;
        this.country = country;
        this.city = city;
        this.district = district;
        this.address = address;
        this.primaryFlag = primaryFlag;
        this.customer = customer;
    }

    private String title;

    @Column(name = "type")
    private AddressType addressType;

    @NotNull
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Country country;

    @NotNull
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private City city;

    @NotNull
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private District district;

    @NotNull
    @Column(nullable = false)
    private String address;

    @NotNull
    @Column(name = "primary_f", columnDefinition = "boolean default false", nullable = false)
    private Boolean primaryFlag;

    @NotNull
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Customer customer;

}
