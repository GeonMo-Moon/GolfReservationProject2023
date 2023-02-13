package com.wangin.admin.repository;



import com.wangin.admin.entity.GolfEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface GolfRepository extends JpaRepository<GolfEntity, String>, QuerydslPredicateExecutor<GolfEntity> {
}
