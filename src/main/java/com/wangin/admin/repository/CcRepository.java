package com.wangin.admin.repository;

import com.wangin.admin.entity.CcEntity;
import com.wangin.admin.entity.GolfEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface CcRepository extends JpaRepository<CcEntity, String>, QuerydslPredicateExecutor<CcEntity> {

}
