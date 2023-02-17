package com.wangin.admin.predicate;

import com.querydsl.core.BooleanBuilder;
import com.wangin.admin.entity.QGolfUserEntity;

public class res1Predicate {
    public static BooleanBuilder search(String id){

        QGolfUserEntity qGolfUserEntity = QGolfUserEntity.golfUserEntity;

        BooleanBuilder builder = new BooleanBuilder();

        builder.and(qGolfUserEntity.UI_ID.eq(id));

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
