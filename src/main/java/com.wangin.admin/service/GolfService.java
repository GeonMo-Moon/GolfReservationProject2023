package com.wangin.admin.service;


import com.wangin.admin.dto.GolfDto;
import com.wangin.admin.dto.GolfUserDto;
import com.wangin.admin.repository.GolfRepository;
import com.wangin.admin.repository.GolfUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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

}
