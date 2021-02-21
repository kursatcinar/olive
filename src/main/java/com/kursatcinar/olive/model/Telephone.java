package com.kursatcinar.olive.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Telephone")
@Table(name = "telephone")
public class Telephone extends BaseEntity{

    @Builder
    public Telephone(Long id, String title, TelephoneType telephoneType, String areaCode, String phoneNumber, Boolean primaryFlag, Customer customer) {
        super(id);
        this.title = title;
        this.telephoneType = telephoneType;
        this.areaCode = areaCode;
        this.phoneNumber = phoneNumber;
        this.primaryFlag = primaryFlag;
        this.customer = customer;
    }

    private String title;

    @Column(name = "type")
    private TelephoneType telephoneType;

    @NotNull
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Country country;

    @NotNull
    @Column(nullable = false)
    private String areaCode;

    @NotNull
    @Column(nullable = false)
    private String phoneNumber;

    @NotNull
    @Column(name = "primary_f", columnDefinition = "boolean default false", nullable = false)
    private Boolean primaryFlag;

    @NotNull
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Customer customer;

}
