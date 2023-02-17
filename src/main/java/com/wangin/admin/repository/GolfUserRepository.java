package com.wangin.admin.repository;



import com.wangin.admin.entity.GolfUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;


public interface GolfUserRepository extends JpaRepository<GolfUserEntity, String>, QuerydslPredicateExecutor<GolfUserEntity> {
}
