package com.wangin.admin.predicate;

import com.querydsl.core.BooleanBuilder;
import com.wangin.admin.entity.QCaEntity;
import com.wangin.admin.entity.QGolfUserEntity;

public class res2Predicate {
    public static BooleanBuilder search(Long uino, Long ccno){

        QCaEntity qCaEntity = QCaEntity.caEntity;

        BooleanBuilder builder = new BooleanBuilder();

        builder.and(qCaEntity.CA_UI_NO.eq(uino).and(qCaEntity.CA_CC_NO.eq(ccno)));

        return builder;
    }
//    public static BooleanBuilder search(String id){
//
//        QGolfUserEntity qGolfUserEntity = QGolfUserEntity.golfUserEntity;
//
//        BooleanBuilder builder = new BooleanBuilder();
//
//        builder.and(qGolfUserEntity.UI_ID.eq(id).and(qGolfUserEntity.UI_PASSWORD.eq(pw)));
//        return builder;
//    }
}
