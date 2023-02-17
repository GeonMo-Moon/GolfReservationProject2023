package com.wangin.admin.repository;

import com.wangin.admin.entity.RlEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface RlRepository extends JpaRepository<RlEntity, String>, QuerydslPredicateExecutor<RlEntity> {
//git
}
