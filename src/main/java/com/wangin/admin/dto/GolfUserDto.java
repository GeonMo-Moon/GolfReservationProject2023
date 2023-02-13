package com.wangin.admin.dto;


import com.wangin.admin.entity.GolfUserEntity;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class GolfUserDto {

    private Long UI_NO;

    private String UI_ID;

    private String UI_PASSWORD;

    private String UI_NAME;

    private String UI_PHONE;

    private int UI_SMS;

    private int UI_STATE;

    private String UI_BAN;

    private String UI_IDATETIME;

    private String UI_UDATETIME;

    @Builder

    public GolfUserDto(Long UI_NO, String UI_ID, String UI_PASSWORD, String UI_NAME, String UI_PHONE, int UI_SMS, int UI_STATE, String UI_BAN, String UI_IDATETIME, String UI_UDATETIME) {
        this.UI_NO = UI_NO;
        this.UI_ID = UI_ID;
        this.UI_PASSWORD = UI_PASSWORD;
        this.UI_NAME = UI_NAME;
        this.UI_PHONE = UI_PHONE;
        this.UI_SMS = UI_SMS;
        this.UI_STATE = UI_STATE;
        this.UI_BAN = UI_BAN;
        this.UI_IDATETIME = UI_IDATETIME;
        this.UI_UDATETIME = UI_UDATETIME;
    }

    public GolfUserEntity toEntity(){
        GolfUserEntity entity = GolfUserEntity.builder()
                .UI_NO(UI_NO)
                .UI_ID(UI_ID)
                .UI_PASSWORD(UI_PASSWORD)
                .UI_NAME(UI_NAME)
                .UI_PHONE(UI_PHONE)
                .UI_SMS(UI_SMS)
                .UI_STATE(UI_STATE)
                .UI_BAN(UI_BAN)
                .UI_IDATETIME(UI_IDATETIME)
                .UI_UDATETIME(UI_UDATETIME)
                .build();
        return entity;
    }

}
