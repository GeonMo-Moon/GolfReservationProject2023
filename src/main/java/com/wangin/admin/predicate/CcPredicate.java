package com.wangin.admin.predicate;

import com.querydsl.core.BooleanBuilder;
import com.wangin.admin.entity.QCcEntity;

public class CcPredicate {
    public static BooleanBuilder ccname(String ccname){
//git
        QCcEntity qCcEntity = QCcEntity.ccEntity;

        BooleanBuilder builder = new BooleanBuilder();

        builder.and(qCcEntity.CC_NAME.eq(ccname));
        return builder;
    }

}
