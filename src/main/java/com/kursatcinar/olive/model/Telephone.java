package com.kursatcinar.olive.model;

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
    }

    private String title;

    @Column(name = "type")
    private TelephoneType telephoneType;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Country country;

    private String areaCode;
    private String phoneNumber;

    @Column(name = "primary_f")
    private Boolean primaryFlag;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Customer customer;

}
