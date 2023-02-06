package com.wangin.admin.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QGradeType3TableEntity is a Querydsl query type for GradeType3TableEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGradeType3TableEntity extends EntityPathBase<GradeType3TableEntity> {

    private static final long serialVersionUID = -680992580L;

    public static final QGradeType3TableEntity gradeType3TableEntity = new QGradeType3TableEntity("gradeType3TableEntity");

    public final NumberPath<Integer> Grade1 = createNumber("Grade1", Integer.class);

    public final NumberPath<Integer> Grade2 = createNumber("Grade2", Integer.class);

    public final NumberPath<Long> Seq = createNumber("Seq", Long.class);

    public final NumberPath<Integer> TotalGrades = createNumber("TotalGrades", Integer.class);

    public QGradeType3TableEntity(String variable) {
        super(GradeType3TableEntity.class, forVariable(variable));
    }

    public QGradeType3TableEntity(Path<? extends GradeType3TableEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGradeType3TableEntity(PathMetadata metadata) {
        super(GradeType3TableEntity.class, metadata);
    }

}

