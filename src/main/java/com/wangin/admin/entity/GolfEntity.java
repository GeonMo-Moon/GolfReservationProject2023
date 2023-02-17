package com.wangin.admin.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "test_reservation_info")
public class GolfEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RI_NO")
    private Long RI_NO;

    @Column(name = "RI_CA_NO")
    private Long RI_CA_NO;

    @Column(name = "RI_UI_NO")
    private Long RI_UI_NO;

    @Column(name = "RI_CC_NO")
    private Long RI_CC_NO;

    @Column(name = "RI_CA_ID")
    private String RI_CA_ID;

    @Column(name = "RI_CA_PASSWORD")
    private String RI_CA_PASSWORD;

    @Column(name = "RI_YEAR")
    private int RI_YEAR;

    @Column(name = "RI_MONTH")
    private int RI_MONTH;

    @Column(name = "RI_DAY")
    private int RI_DAY;

    @Column(name = "RI_START_TIME")
    private int RI_START_TIME;

    @Column(name = "RI_END_TIME")
    private int RI_END_TIME;

    @Column(name = "RI_HALL")
    private int RI_HALL;

    @Column(name = "RI_COURSE")
    private int RI_COURSE;

    @Column(name = "RI_PERSON")
    private int RI_PERSON;

    @Column(name = "RI_SEX")
    private int RI_SEX;

    @Column(name = "RI_STATE")
    private int RI_STATE;

    @Column(name = "RI_CHOICE")
    private int RI_CHOICE;

    @Column(name = "RI_CANCLE_DAY")
    private String RI_CANCLE_DAY;

    @Column(name = "RI_IDATETIME")
    private String RI_IDATETIME;

    @Column(name = "RI_UDATETIME")
    private String RI_UDATETIME;

    @Builder

    public GolfEntity(Long RI_NO, Long RI_CA_NO, Long RI_UI_NO, Long RI_CC_NO, String RI_CA_ID, String RI_CA_PASSWORD, int RI_YEAR, int RI_MONTH, int RI_DAY, int RI_START_TIME, int RI_END_TIME, int RI_HALL, int RI_COURSE, int RI_PERSON, int RI_SEX,
                      int RI_STATE, int RI_CHOICE, String RI_CANCLE_DAY, String RI_IDATETIME, String RI_UDATETIME) {
        this.RI_NO = RI_NO;
        this.RI_CA_NO = RI_CA_NO;
        this.RI_UI_NO = RI_UI_NO;
        this.RI_CC_NO = RI_CC_NO;
        this.RI_CA_ID = RI_CA_ID;
        this.RI_CA_PASSWORD = RI_CA_PASSWORD;
        this.RI_YEAR = RI_YEAR;
        this.RI_MONTH = RI_MONTH;
        this.RI_DAY = RI_DAY;
        this.RI_START_TIME = RI_START_TIME;
        this.RI_END_TIME = RI_END_TIME;
        this.RI_HALL = RI_HALL;
        this.RI_COURSE = RI_COURSE;
        this.RI_PERSON = RI_PERSON;
        this.RI_SEX = RI_SEX;
        this.RI_STATE = RI_STATE;
        this.RI_CHOICE = RI_CHOICE;
        this.RI_CANCLE_DAY = RI_CANCLE_DAY;
        this.RI_IDATETIME = RI_IDATETIME;
        this.RI_UDATETIME = RI_UDATETIME;
    }
}
