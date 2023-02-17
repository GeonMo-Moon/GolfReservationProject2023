package com.wangin.admin.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCaEntity is a Querydsl query type for CaEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCaEntity extends EntityPathBase<CaEntity> {

    private static final long serialVersionUID = 684802388L;

    public static final QCaEntity caEntity = new QCaEntity("caEntity");

    public final NumberPath<Long> CA_CC_NO = createNumber("CA_CC_NO", Long.class);

    public final StringPath CA_ID = createString("CA_ID");

    public final StringPath CA_IDATETIME = createString("CA_IDATETIME");

    public final NumberPath<Long> CA_NO = createNumber("CA_NO", Long.class);

    public final StringPath CA_PASSWORD = createString("CA_PASSWORD");

    public final NumberPath<Integer> CA_STATE = createNumber("CA_STATE", Integer.class);

    public final StringPath CA_UDATETIME = createString("CA_UDATETIME");

    public final NumberPath<Long> CA_UI_NO = createNumber("CA_UI_NO", Long.class);

    public QCaEntity(String variable) {
        super(CaEntity.class, forVariable(variable));
    }

    public QCaEntity(Path<? extends CaEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCaEntity(PathMetadata metadata) {
        super(CaEntity.class, metadata);
    }

}

