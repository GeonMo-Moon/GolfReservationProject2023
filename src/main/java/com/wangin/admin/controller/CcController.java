package com.wangin.admin.controller;

import com.wangin.admin.common.SessionCheck;
import com.wangin.admin.dto.CcDto;
import com.wangin.admin.entity.CcEntity;
import com.wangin.admin.repository.CcRepository;
import com.wangin.admin.service.GolfService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor
public class CcController {
    private GolfService golfService;
    private CcRepository ccRepository;
// 준호씨의 방식

    @GetMapping("/gcountryclub")
    public String gcountryclub(Model m, HttpServletRequest request) {
        String returnValue = "";
        HttpSession session = request.getSession();
        if (new SessionCheck().loginSessionCheck(request)) {
            String sessioninid = (String) session.getAttribute("user_signature");

            List<CcEntity> ccn = ccRepository.findAll();
            m.addAttribute("ccname4", ccn);
            returnValue = "Countryclub";
        } else {
            returnValue = "formRI";
        }
        return returnValue;
    }

    @PostMapping("/countryclub2")
    public String countryclub(HttpServletRequest request, Model model,
                              @RequestParam(required = false, defaultValue = "", value = "ccname") String ccname,
                              @RequestParam(required = false, defaultValue = "", value = "ccurl") String ccurl,
                              @RequestParam(required = false, defaultValue = "", value = "cccancel") int cccancel,
                              @RequestParam(required = false, defaultValue = "", value = "ccopen") int ccopen,
                              @RequestParam(required = false, defaultValue = "", value = "cctype") int cctype,
                              @RequestParam(required = false, defaultValue = "", value = "ccrv") int ccrv) {
        System.out.println("hi?");
        CcDto ccDto = new CcDto(null, ccname, ccurl, cccancel, ccopen, cctype, ccrv, null,null);
        golfService.Ccinsert(ccDto);
        List<CcEntity> ccn = ccRepository.findAll();
        model.addAttribute("ccname4",ccn);
        return "/gcountryclub";
    }

}
