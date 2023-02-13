package com.wangin.admin.predicate;

import com.querydsl.core.BooleanBuilder;
import com.wangin.admin.entity.QGolfUserEntity;

public class LoginPredicate {
    public static BooleanBuilder search(String id, String pw){

        QGolfUserEntity qGolfUserEntity = QGolfUserEntity.golfUserEntity;

        BooleanBuilder builder = new BooleanBuilder();

        builder.and(qGolfUserEntity.UI_ID.eq(id).and(qGolfUserEntity.UI_PASSWORD.eq(pw)));
        return builder;
    }
    public static BooleanBuilder hiuser(String id) {

        QGolfUserEntity qGolfUserEntity = QGolfUserEntity.golfUserEntity;

        BooleanBuilder builder = new BooleanBuilder();

        builder.and(qGolfUserEntity.UI_ID.eq(id));
        return builder;

    }
}
