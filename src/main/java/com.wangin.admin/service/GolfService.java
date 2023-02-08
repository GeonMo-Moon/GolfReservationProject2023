package com.wangin.admin.service;


import com.wangin.admin.dto.GolfDto;
import com.wangin.admin.dto.GolfUserDto;
import com.wangin.admin.entity.GolfUserEntity;
import com.wangin.admin.predicate.LoginPredicate;
import com.wangin.admin.repository.GolfRepository;
import com.wangin.admin.repository.GolfUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GolfService {

    private GolfRepository golfRepository;
    private GolfUserRepository golfUserRepository;

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

}
