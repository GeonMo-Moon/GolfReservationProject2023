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
@Table(name="TEST_CLUB_ACCOUNT")
public class CaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CA_NO")
    private Long CA_NO;

    @Column(name = "CA_UI_NO")
    private Long CA_UI_NO;

    @Column(name = "CA_CC_NO")
    private Long CA_CC_NO;

    @Column(name="CA_ID")
    private String CA_ID;

    @Column(name="CA_PASSWORD")
    private String CA_PASSWORD;

    @Column(name="CA_STATE")
    private int CA_STATE;

    @Column(name="CA_IDATETIME")
    private String CA_IDATETIME;

    @Column(name="CA_UDATETIME")
    private String CA_UDATETIME;

    @Builder
    public CaEntity(Long CA_NO, Long CA_UI_NO, Long CA_CC_NO, String CA_ID, String CA_PASSWORD, int CA_STATE, String CA_IDATETIME, String CA_UDATETIME){
        this.CA_NO=CA_NO;
        this.CA_UI_NO = CA_UI_NO;
        this.CA_CC_NO = CA_CC_NO;
        this.CA_ID = CA_ID;
        this.CA_PASSWORD=CA_PASSWORD;
        this.CA_STATE=CA_STATE;
        this.CA_IDATETIME=CA_IDATETIME;
        this.CA_UDATETIME=CA_UDATETIME;
    }

}
