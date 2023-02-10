package com.wangin.admin.dto;

import com.wangin.admin.entity.CourseEntity;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class CourseDto {
    private Long C_NO;
    private Long C_CC_NO;
    private String C_CC_NAME;
    private String C_NAME;
    private int C_NUMBER;
    private String C_IDATETIME;
    private String C_UPDATETIME;

    @Builder

    public CourseDto(Long C_NO, Long C_CC_NO, String C_CC_NAME, String C_NAME, int C_NUMBER,
                     String C_IDATETIME, String C_UPDATETIME){
        this.C_NO = C_NO;
        this.C_CC_NO = C_CC_NO;
        this.C_CC_NAME = C_CC_NAME;
        this.C_NAME = C_NAME;
        this.C_NUMBER=C_NUMBER;
        this.C_IDATETIME=C_IDATETIME;
        this.C_UPDATETIME=C_UPDATETIME;
    }
    public CourseEntity toEntity(){
        CourseEntity entity = CourseEntity.builder()
                .C_NO(C_NO)
                .C_CC_NO(C_CC_NO)
                .C_CC_NAME(C_CC_NAME)
                .C_NAME(C_NAME)
                .C_NUMBER(C_NUMBER)
                .C_IDATETIME(C_IDATETIME)
                .C_UPDATETIME(C_UPDATETIME)
                .build();

        return entity;

    }
}
