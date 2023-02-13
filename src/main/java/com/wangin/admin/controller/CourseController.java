package com.wangin.admin.controller;


//import com.wangin.admin.common.SessionCheck;
import com.wangin.admin.dto.CcDto;
import com.wangin.admin.dto.CourseDto;
import com.wangin.admin.entity.CcEntity;
import com.wangin.admin.predicate.CcPredicate;
import com.wangin.admin.repository.CcRepository;
import com.wangin.admin.service.GolfService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class CourseController {

    private GolfService golfService;
    private CcRepository ccRepository;


    @GetMapping("/course")
    public String gcourse(Model m, HttpServletRequest request){
        return "Course.html";
    }

    @PostMapping("/course2")
    public String gcourse2(HttpServletRequest request, Model model,
                           @RequestParam(required = false, defaultValue = "", value = "ccname2") String ccname2,
                           @RequestParam(required = false, defaultValue = "", value = "coursename") String coursename,
                           @RequestParam(required = false, defaultValue = "", value = "coursenum") int coursenum) {


//        Optional<CcEntity> ccn = ccRepository.findById(ccname2);
        Optional<CcEntity> ccnn = ccRepository.findOne(CcPredicate.ccname(ccname2));

        Long findccnum = ccnn.get().getCC_NO();

        CourseDto courseDto = new CourseDto(null, findccnum, ccname2, coursename, coursenum, null,null);
        golfService.Courseinsert(courseDto);
        return "Course.html";
    }

}
