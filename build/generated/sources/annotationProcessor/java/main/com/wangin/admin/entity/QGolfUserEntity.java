package com.wangin.admin.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QGolfUserEntity is a Querydsl query type for GolfUserEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGolfUserEntity extends EntityPathBase<GolfUserEntity> {

    private static final long serialVersionUID = -1719582013L;

    public static final QGolfUserEntity golfUserEntity = new QGolfUserEntity("golfUserEntity");

    public final StringPath UI_BAN = createString("UI_BAN");

    public final StringPath UI_ID = createString("UI_ID");

    public final StringPath UI_IDATETIME = createString("UI_IDATETIME");

    public final StringPath UI_NAME = createString("UI_NAME");

    public final NumberPath<Long> UI_NO = createNumber("UI_NO", Long.class);

    public final StringPath UI_PASSWORD = createString("UI_PASSWORD");

    public final StringPath UI_PHONE = createString("UI_PHONE");

    public final NumberPath<Integer> UI_SMS = createNumber("UI_SMS", Integer.class);

    public final NumberPath<Integer> UI_STATE = createNumber("UI_STATE", Integer.class);

    public final StringPath UI_UDATETIME = createString("UI_UDATETIME");

    public QGolfUserEntity(String variable) {
        super(GolfUserEntity.class, forVariable(variable));
    }

    public QGolfUserEntity(Path<? extends GolfUserEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGolfUserEntity(PathMetadata metadata) {
        super(GolfUserEntity.class, metadata);
    }

}

