package com.wangin.admin.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCourseEntity is a Querydsl query type for CourseEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCourseEntity extends EntityPathBase<CourseEntity> {

    private static final long serialVersionUID = -1473338927L;

    public static final QCourseEntity courseEntity = new QCourseEntity("courseEntity");

    public final StringPath C_CC_NAME = createString("C_CC_NAME");

    public final NumberPath<Long> C_CC_NO = createNumber("C_CC_NO", Long.class);

    public final StringPath C_IDATETIME = createString("C_IDATETIME");

    public final StringPath C_NAME = createString("C_NAME");

    public final NumberPath<Long> C_NO = createNumber("C_NO", Long.class);

    public final NumberPath<Integer> C_NUMBER = createNumber("C_NUMBER", Integer.class);

    public final StringPath C_UDATETIME = createString("C_UDATETIME");

    public QCourseEntity(String variable) {
        super(CourseEntity.class, forVariable(variable));
    }

    public QCourseEntity(Path<? extends CourseEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCourseEntity(PathMetadata metadata) {
        super(CourseEntity.class, metadata);
    }

}

