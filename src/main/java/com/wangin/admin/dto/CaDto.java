package com.wangin.admin.dto;

import com.wangin.admin.entity.CaEntity;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CaDto {
    private Long CA_NO;
    private Long CA_UI_NO;
    private Long CA_CC_NO;
    private String CA_ID;
    private String CA_PASSWORD;
    private int CA_STATE;
    private String CA_IDATETIME;
    private String CA_UDATETIME;

    @Builder

    public CaDto(Long CA_NO, Long CA_UI_NO, Long CA_CC_NO, String CA_ID, String CA_PASSWORD, int CA_STATE, String CA_IDATETIME, String CA_UDATETIME){
        this.CA_NO = CA_NO;
        this.CA_UI_NO = CA_UI_NO;
        this.CA_CC_NO = CA_CC_NO;
        this.CA_ID = CA_ID;
        this.CA_PASSWORD = CA_PASSWORD;
        this.CA_STATE = CA_STATE;
        this.CA_IDATETIME = CA_IDATETIME;
        this.CA_UDATETIME = CA_UDATETIME;
    }
    public CaEntity toEntity(){
        CaEntity entity = CaEntity.builder()
                .CA_NO(CA_NO)
                .CA_UI_NO(CA_UI_NO)
                .CA_CC_NO(CA_CC_NO)
                .CA_ID(CA_ID)
                .CA_PASSWORD(CA_PASSWORD)
                .CA_STATE(CA_STATE)
                .CA_IDATETIME(CA_IDATETIME)
                .CA_UDATETIME(CA_UDATETIME)
                .build();

        return entity;

    }
}
