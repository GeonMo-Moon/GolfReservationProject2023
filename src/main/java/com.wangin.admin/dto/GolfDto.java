package com.wangin.admin.dto;

import com.wangin.admin.entity.GolfEntity;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class GolfDto {

    private Long RI_NO;

    private int RI_CA_NO;

    private int RI_UI_NO;

    private int RI_CC_NO;

    private String RI_CA_ID;

    private String RI_CA_PASSWORD;

    private int RI_YEAR;

    private int RI_MONTH;

    private int RI_DAY;

    private int RI_START_TIME;

    private int RI_END_TIME;

    private int RI_HALL;

    private int RI_COURSE;

    private int RI_PERSON;

    private int RI_SEX;

    private int RI_STATE;

    private int RI_CHOICE;

    private String RI_CANCLE_DAY;

    private String RI_IDATETIME;

    private String RI_UDATETIME;

    @Builder

    public GolfDto(Long RI_NO, int RI_CA_NO, int RI_UI_NO, int RI_CC_NO, String RI_CA_ID, String RI_CA_PASSWORD, int RI_YEAR, int RI_MONTH, int RI_DAY, int RI_START_TIME, int RI_END_TIME, int RI_HALL, int RI_COURSE, int RI_PERSON, int RI_SEX,
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

    public GolfEntity toEntity(){
        GolfEntity entity = GolfEntity.builder()
                .RI_NO(RI_NO)
                .RI_CA_NO(RI_CA_NO)
                .RI_UI_NO(RI_UI_NO)
                .RI_CC_NO(RI_CC_NO)
                .RI_CA_ID(RI_CA_ID)
                .RI_CA_PASSWORD(RI_CA_PASSWORD)
                .RI_YEAR(RI_YEAR)
                .RI_MONTH(RI_MONTH)
                .RI_DAY(RI_DAY)
                .RI_START_TIME(RI_START_TIME)
                .RI_END_TIME(RI_END_TIME)
                .RI_HALL(RI_HALL)
                .RI_COURSE(RI_COURSE)
                .RI_PERSON(RI_PERSON)
                .RI_SEX(RI_SEX)
                .RI_STATE(RI_STATE)
                .RI_CHOICE(RI_CHOICE)
                .RI_CANCLE_DAY(RI_CANCLE_DAY)
                .RI_IDATETIME(RI_IDATETIME)
                .RI_UDATETIME(RI_UDATETIME)
                .build();
        return entity;
    }

}
