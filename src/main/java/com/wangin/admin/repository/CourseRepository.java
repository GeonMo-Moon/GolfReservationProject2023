package com.wangin.admin.repository;

import com.wangin.admin.entity.CcEntity;
import com.wangin.admin.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<CourseEntity, String>, QuerydslPredicateExecutor<CourseEntity> {
//git
}
