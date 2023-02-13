package com.wangin.admin.repository;

import com.wangin.admin.entity.CaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface CaRepository extends JpaRepository<CaEntity,Long>, QuerydslPredicateExecutor<CaEntity> {
}
