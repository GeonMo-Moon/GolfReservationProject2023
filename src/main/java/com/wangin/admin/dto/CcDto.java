package com.wangin.admin.dto;

import com.wangin.admin.entity.CcEntity;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CcDto {
    private Long CC_NO;
    private String CC_NAME;
    private String CC_URL;
    private int CC_CANCEL_DAY;
    private int CC_OPENTIME;
    private int CC_TYPE;
    private int CC_RESERVATION;
    private String CC_IDATETIME;
    private String CC_UDATETIME;

    @Builder

    public CcDto(Long CC_NO, String CC_NAME, String CC_URL, int CC_CANCEL_DAY, int CC_OPENTIME, int CC_TYPE, int CC_RESERVATION, String CC_IDATETIME, String CC_UDATETIME) {
        this.CC_NO = CC_NO;
        this.CC_NAME = CC_NAME;
        this.CC_URL = CC_URL;
        this.CC_CANCEL_DAY = CC_CANCEL_DAY;
        this.CC_OPENTIME = CC_OPENTIME;
        this.CC_TYPE = CC_TYPE;
        this.CC_RESERVATION = CC_RESERVATION;
        this.CC_IDATETIME = CC_IDATETIME;
        this.CC_UDATETIME = CC_UDATETIME;

    }
    public CcEntity toEntity(){
        CcEntity entity = CcEntity.builder()
                .CC_NO(CC_NO)
                .CC_NAME(CC_NAME)
                .CC_URL(CC_URL)
                .CC_CANCEL_DAY(CC_CANCEL_DAY)
                .CC_OPENTIME(CC_OPENTIME)
                .CC_TYPE(CC_TYPE)
                .CC_RESERVATION(CC_RESERVATION)
                .CC_IDATETIME(CC_IDATETIME)
                .CC_UDATETIME(CC_UDATETIME)
                .build();

        return entity;

    }
}
