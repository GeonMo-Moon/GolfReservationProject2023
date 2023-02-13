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
@Table(name = "test_user_info")
public class GolfUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UI_NO")
    private Long UI_NO;

    @Column(name = "UI_ID")
    private String UI_ID;

    @Column(name = "UI_PASSWORD")
    private String UI_PASSWORD;

    @Column(name = "UI_NAME")
    private String UI_NAME;

    @Column(name = "UI_PHONE")
    private String UI_PHONE;

    @Column(name = "UI_SMS")
    private int UI_SMS;

    @Column(name = "UI_STATE")
    private int UI_STATE;

    @Column(name = "UI_BAN")
    private String UI_BAN;

    @Column(name = "UI_IDATETIME")
    private String UI_IDATETIME;

    @Column(name = "UI_UDATETIME")
    private String UI_UDATETIME;

    @Builder

    public GolfUserEntity(Long UI_NO, String UI_ID, String UI_PASSWORD, String UI_NAME, String UI_PHONE, int UI_SMS, int UI_STATE, String UI_BAN, String UI_IDATETIME, String UI_UDATETIME) {
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
}
