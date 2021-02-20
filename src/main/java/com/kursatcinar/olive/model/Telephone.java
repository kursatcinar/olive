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

    @Column(name = "title")
    private String title;

    @Column(name = "type")
    private TelephoneType telephoneType;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;

    @Column(name = "area_code")
    private String areaCode;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "primary_f")
    private Boolean primaryFlag;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name="customer_id", referencedColumnName = "id")
    private Customer customer;

}
