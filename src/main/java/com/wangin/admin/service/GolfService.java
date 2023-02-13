package com.wangin.admin.service;


import com.wangin.admin.dto.*;
import com.wangin.admin.entity.GolfUserEntity;
import com.wangin.admin.predicate.LoginPredicate;
import com.wangin.admin.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GolfService {
    private CcRepository ccRepository;
    private GolfRepository golfRepository;
    private GolfUserRepository golfUserRepository;
    private CourseRepository courseRepository;
    private CaRepository caRepository;

    @Transactional
    public Long insertData1(GolfDto golfDto){
        return golfRepository.save(golfDto.toEntity()).getRI_NO();
    }

    @Transactional
    public Long insertData2(GolfUserDto golfUserDto){
        return golfUserRepository.save(golfUserDto.toEntity()).getUI_NO();

    }
    @Transactional
    public int loginAdmin(String userid, String userpw) {
        int returnValue = 0;
        Optional<GolfUserEntity> ggg = golfUserRepository.findOne(LoginPredicate.search(userid, userpw));

        if (!ggg.isPresent()) {
            returnValue = 0;
        } else {
            returnValue = 1;
        }
        return returnValue;
    }
    @Transactional
    public Long Ccinsert(CcDto ccDto){
        return ccRepository.save(ccDto.toEntity()).getCC_NO();
    }

    @Transactional
    public Long Courseinsert(CourseDto courseDto){
        return courseRepository.save(courseDto.toEntity()).getC_NO();
    }

    @Transactional
    public Long Cainsert(CaDto caDto){
        return caRepository.save(caDto.toEntity()).getCA_NO();
    }


}
