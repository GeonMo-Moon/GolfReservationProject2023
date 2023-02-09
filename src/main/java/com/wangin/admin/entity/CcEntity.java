package com.wangin.admin.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="TEST_COUNTRY_CLUB")
public class CcEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CC_NO")
    private Long CC_NO;

    @Column(name = "CC_NAME")
    private String CC_NAME;

    @Column(name = "CC_URL")
    private String CC_URL;

    @Column(name="CC_CANCEL_DAY")
    private int CC_CANCEL_DAY;

    @Column(name="CC_OPENTIME")
    private int CC_OPENTIME;

    @Column(name="CC_TYPE")
    private int CC_TYPE;

    @Column(name="CC_RESERVATION")
    private int CC_RESERVATION;

    @Column(name="CC_IDATETIME")
    private String CC_IDATETIME;

    @Column(name="CC_UDATETIME")
    private String CC_UDATETIME;

    @Builder
    public CcEntity(Long CC_NO, String CC_NAME, String CC_URL, int CC_CANCEL_DAY, int CC_OPENTIME, int CC_TYPE, int CC_RESERVATION, String CC_IDATETIME, String CC_UDATETIME){
        this.CC_NO=CC_NO;
        this.CC_NAME = CC_NAME;
        this.CC_URL=CC_URL;
        this.CC_CANCEL_DAY=CC_CANCEL_DAY;
        this.CC_OPENTIME=CC_OPENTIME;
        this.CC_TYPE=CC_TYPE;
        this.CC_RESERVATION=CC_RESERVATION;
        this.CC_IDATETIME=CC_IDATETIME;
        this.CC_UDATETIME=CC_UDATETIME;

    }
}
