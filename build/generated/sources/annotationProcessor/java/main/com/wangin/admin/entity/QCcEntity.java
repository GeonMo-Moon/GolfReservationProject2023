package com.wangin.admin.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCcEntity is a Querydsl query type for CcEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCcEntity extends EntityPathBase<CcEntity> {

    private static final long serialVersionUID = -1835157546L;

    public static final QCcEntity ccEntity = new QCcEntity("ccEntity");

    public final NumberPath<Integer> CC_CANCEL_DAY = createNumber("CC_CANCEL_DAY", Integer.class);

    public final StringPath CC_IDATETIME = createString("CC_IDATETIME");

    public final StringPath CC_NAME = createString("CC_NAME");

    public final NumberPath<Long> CC_NO = createNumber("CC_NO", Long.class);

    public final NumberPath<Integer> CC_OPENTIME = createNumber("CC_OPENTIME", Integer.class);

    public final NumberPath<Integer> CC_RESERVATION = createNumber("CC_RESERVATION", Integer.class);

    public final NumberPath<Integer> CC_TYPE = createNumber("CC_TYPE", Integer.class);

    public final StringPath CC_UDATETIME = createString("CC_UDATETIME");

    public final StringPath CC_URL = createString("CC_URL");

    public QCcEntity(String variable) {
        super(CcEntity.class, forVariable(variable));
    }

    public QCcEntity(Path<? extends CcEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCcEntity(PathMetadata metadata) {
        super(CcEntity.class, metadata);
    }

}

