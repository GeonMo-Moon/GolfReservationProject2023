package com.wangin.admin.dto;

import com.wangin.admin.entity.CcEntity;
import com.wangin.admin.entity.RlEntity;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class RlDto {
    //git
    private Long RL_NO;
    private Long RL_RI_NO;
    private Long RL_UI_NO;
    private String RL_TEXT;
    private String RL_IDATETIME;

    @Builder

    public RlDto(Long RL_NO, Long RL_RI_NO, Long RL_UI_NO, String RL_TEXT, String RL_IDATETIME) {
        this.RL_NO = RL_NO;
        this.RL_RI_NO = RL_RI_NO;
        this.RL_UI_NO = RL_UI_NO;
        this.RL_TEXT = RL_TEXT;
        this.RL_IDATETIME = RL_IDATETIME;

    }
    public RlEntity toEntity(){
        RlEntity entity = RlEntity.builder()
                .RL_NO(RL_NO)
                .RL_RI_NO(RL_RI_NO)
                .RL_UI_NO(RL_UI_NO)
                .RL_TEXT(RL_TEXT)
                .RL_IDATETIME(RL_IDATETIME)
                .build();

        return entity;

    }
}
