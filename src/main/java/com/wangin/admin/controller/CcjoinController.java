package com.wangin.admin.controller;

import com.wangin.admin.common.SessionCheck;
import com.wangin.admin.dto.CaDto;
import com.wangin.admin.entity.CcEntity;
import com.wangin.admin.entity.GolfUserEntity;
import com.wangin.admin.predicate.CcPredicate;
import com.wangin.admin.predicate.LoginPredicate;
import com.wangin.admin.repository.CcRepository;
import com.wangin.admin.repository.GolfUserRepository;
import com.wangin.admin.service.GolfService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
@RequestMapping("/")
public class CcjoinController {
    private CcRepository ccRepository;
    private GolfUserRepository golfUserRepository;
    private GolfService golfService;
    @GetMapping("/gaccount")
    public String ccjoin(Model m, HttpServletRequest request){
        String returnValue= "";
        // 로그인 성공시 페이지 이동가능하게
        if(new SessionCheck().loginSessionCheck(request)){
            List<CcEntity> ccn = ccRepository.findAll();
            m.addAttribute("ccname4",ccn);
            returnValue = "formCA";
        }else{
            returnValue = "formRI";
        }
        return returnValue;
    }


    @PostMapping("/ccjoin")
    public String ccjoin1(HttpServletRequest request, Model model,
                          @RequestParam(required = false, defaultValue = "", value = "ccname2") String ccname2,
                          @RequestParam(required = false, defaultValue = "", value = "ccid") String ccid,
                          @RequestParam(required = false, defaultValue = "", value = "ccpw") String ccpw){
        System.out.println(ccname2+ccid+ccpw);
        HttpSession session = request.getSession();
        String sessioninid = (String) session.getAttribute("user_signature");
        Optional<CcEntity> ccnn = ccRepository.findOne(CcPredicate.ccname(ccname2));
        Optional<GolfUserEntity> guet = golfUserRepository.findOne(LoginPredicate.hiuser(sessioninid));
        Long findccnum = ccnn.get().getCC_NO();
        Long finduinum = guet.get().getUI_NO();
        System.out.println(findccnum);
        System.out.println(finduinum);
        int status= 0;
        if(session.getAttribute("user_signature")==null){
            status =0;
        }else {
            status =1;
        }

        CaDto caDto = new CaDto(null, finduinum, findccnum, ccid, ccpw, status,null,null);
        golfService.Cainsert(caDto);

        return "formCA";
    }
}