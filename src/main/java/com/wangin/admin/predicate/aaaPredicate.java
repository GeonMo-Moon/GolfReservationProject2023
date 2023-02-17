package com.wangin.admin.predicate;

import com.querydsl.core.BooleanBuilder;
import com.wangin.admin.entity.QGolfEntity;
import com.wangin.admin.entity.QGolfUserEntity;

public class aaaPredicate {
    public static BooleanBuilder search(Long a){

        QGolfEntity qGolfEntity = QGolfEntity.golfEntity;

        BooleanBuilder builder = new BooleanBuilder();

        builder.and(qGolfEntity.RI_UI_NO.eq(a));

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
