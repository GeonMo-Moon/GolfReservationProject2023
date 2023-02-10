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
@Table(name="course")
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="C_NO")
    private Long C_NO;

    @Column(name="C_CC_NO")
    private Long C_CC_NO;

    @Column(name="C_CC_NAME")
    private String C_CC_NAME;

    @Column(name="C_NAME")
    private String C_NAME;

    @Column(name="C_NUMBER")
    private int C_NUMBER;

    @Column(name = "C_IDATETIME")
    private String C_IDATETIME;

    @Column
    private String C_UDATETIME;

    @Builder
    public CourseEntity(Long C_NO, Long C_CC_NO, String C_CC_NAME, String C_NAME,
                        int C_NUMBER, String C_IDATETIME, String C_UPDATETIME){
        this.C_NO = C_NO;
        this.C_CC_NO = C_CC_NO;
        this.C_CC_NAME = C_CC_NAME;
        this.C_NAME = C_NAME;
        this.C_NUMBER = C_NUMBER;
        this.C_IDATETIME = C_IDATETIME;
        this.C_UDATETIME = C_UPDATETIME;





    }
}
