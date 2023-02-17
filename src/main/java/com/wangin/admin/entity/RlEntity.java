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
@Table(name="TEST_RESERVATION_LOG")
public class RlEntity {
//git
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RL_NO")
    private Long RL_NO;

    @Column(name = "RL_RI_NO")
    private Long RL_RI_NO;

    @Column(name = "RL_UI_NO")
    private Long RL_UI_NO;

    @Column(name = "RL_TEXT")
    private String RL_TEXT;

    @Column(name = "RL_IDATETIME")
    private String RL_IDATETIME;

    @Builder
    public RlEntity(Long RL_NO, Long RL_RI_NO, Long RL_UI_NO, String RL_TEXT, String RL_IDATETIME){
        this.RL_NO=RL_NO;
        this.RL_RI_NO = RL_RI_NO;
        this.RL_UI_NO=RL_UI_NO;
        this.RL_TEXT=RL_TEXT;
        this.RL_IDATETIME=RL_IDATETIME;

    }
}
