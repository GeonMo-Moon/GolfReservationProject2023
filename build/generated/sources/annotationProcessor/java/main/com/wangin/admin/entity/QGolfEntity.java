package com.wangin.admin.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QGolfEntity is a Querydsl query type for GolfEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGolfEntity extends EntityPathBase<GolfEntity> {

    private static final long serialVersionUID = 43553176L;

    public static final QGolfEntity golfEntity = new QGolfEntity("golfEntity");

    public final StringPath RI_CA_ID = createString("RI_CA_ID");

    public final NumberPath<Integer> RI_CA_NO = createNumber("RI_CA_NO", Integer.class);

    public final StringPath RI_CA_PASSWORD = createString("RI_CA_PASSWORD");

    public final StringPath RI_CANCLE_DAY = createString("RI_CANCLE_DAY");

    public final NumberPath<Integer> RI_CC_NO = createNumber("RI_CC_NO", Integer.class);

    public final NumberPath<Integer> RI_CHOICE = createNumber("RI_CHOICE", Integer.class);

    public final NumberPath<Integer> RI_COURSE = createNumber("RI_COURSE", Integer.class);

    public final NumberPath<Integer> RI_DAY = createNumber("RI_DAY", Integer.class);

    public final NumberPath<Integer> RI_END_TIME = createNumber("RI_END_TIME", Integer.class);

    public final NumberPath<Integer> RI_HALL = createNumber("RI_HALL", Integer.class);

    public final StringPath RI_IDATETIME = createString("RI_IDATETIME");

    public final NumberPath<Integer> RI_MONTH = createNumber("RI_MONTH", Integer.class);

    public final NumberPath<Long> RI_NO = createNumber("RI_NO", Long.class);

    public final NumberPath<Integer> RI_PERSON = createNumber("RI_PERSON", Integer.class);

    public final NumberPath<Integer> RI_SEX = createNumber("RI_SEX", Integer.class);

    public final NumberPath<Integer> RI_START_TIME = createNumber("RI_START_TIME", Integer.class);

    public final NumberPath<Integer> RI_STATE = createNumber("RI_STATE", Integer.class);

    public final StringPath RI_UDATETIME = createString("RI_UDATETIME");

    public final NumberPath<Integer> RI_UI_NO = createNumber("RI_UI_NO", Integer.class);

    public final NumberPath<Integer> RI_YEAR = createNumber("RI_YEAR", Integer.class);

    public QGolfEntity(String variable) {
        super(GolfEntity.class, forVariable(variable));
    }

    public QGolfEntity(Path<? extends GolfEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGolfEntity(PathMetadata metadata) {
        super(GolfEntity.class, metadata);
    }

}

