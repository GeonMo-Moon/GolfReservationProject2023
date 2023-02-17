package com.wangin.admin.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRlEntity is a Querydsl query type for RlEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRlEntity extends EntityPathBase<RlEntity> {

    private static final long serialVersionUID = -2065207760L;

    public static final QRlEntity rlEntity = new QRlEntity("rlEntity");

    public final StringPath RL_IDATETIME = createString("RL_IDATETIME");

    public final NumberPath<Long> RL_NO = createNumber("RL_NO", Long.class);

    public final NumberPath<Long> RL_RI_NO = createNumber("RL_RI_NO", Long.class);

    public final StringPath RL_TEXT = createString("RL_TEXT");

    public final NumberPath<Long> RL_UI_NO = createNumber("RL_UI_NO", Long.class);

    public QRlEntity(String variable) {
        super(RlEntity.class, forVariable(variable));
    }

    public QRlEntity(Path<? extends RlEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRlEntity(PathMetadata metadata) {
        super(RlEntity.class, metadata);
    }

}

