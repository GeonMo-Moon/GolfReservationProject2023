package com.wangin.admin.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QStudentTableEntity is a Querydsl query type for StudentTableEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStudentTableEntity extends EntityPathBase<StudentTableEntity> {

    private static final long serialVersionUID = 2044701641L;

    public static final QStudentTableEntity studentTableEntity = new QStudentTableEntity("studentTableEntity");

    public final StringPath Password = createString("Password");

    public final NumberPath<Integer> Phone = createNumber("Phone", Integer.class);

    public final NumberPath<Long> Seq = createNumber("Seq", Long.class);

    public QStudentTableEntity(String variable) {
        super(StudentTableEntity.class, forVariable(variable));
    }

    public QStudentTableEntity(Path<? extends StudentTableEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStudentTableEntity(PathMetadata metadata) {
        super(StudentTableEntity.class, metadata);
    }

}

