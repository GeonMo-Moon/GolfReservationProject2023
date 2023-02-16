package com.wangin.admin.predicate;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.wangin.admin.entity.QGolfEntity;
import com.wangin.admin.entity.QGolfUserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class RvPredicate {

    public static BooleanBuilder rvv(Long num){

        QGolfEntity qGolfEntity = QGolfEntity.golfEntity;
        BooleanBuilder builder = new BooleanBuilder();
        builder.and(qGolfEntity.RI_UI_NO.in(num).and(qGolfEntity.RI_STATE.lt(5)));
        return builder;
    }


    QGolfEntity qGolfEntity = QGolfEntity.golfEntity;
    QGolfUserEntity qGolfUserEntity = QGolfUserEntity.golfUserEntity;
//    @Autowired
//    private final EntityManager em;
//        JPAQueryFactory queryFactory;
//    JPAQueryFactory queryFactory = new JPAQueryFactory(em);

//    @Bean
//    public JPAQueryFactory jpaQueryFactory(){
//        return new JPAQueryFactory(em);
//    }
//    public void basicquery(Long num){
//        List<GolfEntity> results = query
//                .selectFrom(qGolfEntity)
//                .where(qGolfEntity.RI_STATE.lt(5).and(qGolfEntity.RI_UI_NO.in(num)))
//                .fetch();
//    }

//}

//        public List<GolfEntity> rvv(String id){
//         BooleanBuilder builder = new BooleanBuilder();
//        if(id!=null){
//            builder.and(qGolfEntity.RI_CA_ID.eq(id).and(qGolfEntity.RI_STATE.lt(5)));
//        }
//        return queryFactory
//                .selectFrom(qGolfEntity)
//                .where(builder)
//                .fetch();
//        }
//    public List<GolfEntity> findByRi_ui_noAndRi_stateLessThan5(Long num) {
//
//        return queryFactory.selectFrom(qGolfEntity)
//                .where(
//                        qGolfEntity.RI_UI_NO.in(
//                                JPAExpressions
//                                        .select(qGolfEntity.RI_UI_NO)
//                                        .from(qGolfEntity)
//                                        .where(qGolfEntity.RI_UI_NO.lt(5))
//                        )
//                )
//                .fetch();
//    }
}








//    public JPAQueryFactory getQueryFactory() {
//        return queryFactory;
//    }
//}


