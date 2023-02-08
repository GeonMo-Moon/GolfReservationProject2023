package com.wangin.admin.controller;


import com.wangin.admin.common.SessionCheck;
import com.wangin.admin.entity.GolfUserEntity;
import com.wangin.admin.predicate.LoginPredicate;
import com.wangin.admin.repository.GolfUserRepository;
import com.wangin.admin.service.GolfService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class LoginController {

    private GolfUserRepository golfUserRepository;
    private GolfService loginService;

    @GetMapping("/glogin")
    public String login(Model m, HttpServletRequest request){
        return "golflogin.html";
    }

    @PostMapping("/")
    public String moveLogin(Model m, HttpServletRequest request){
        String returnValue = "";
        if(new SessionCheck().loginSessionCheck(request)){
            returnValue = "golfchoice.html";
        }else{
            returnValue = "golflogin.html";
        }
        return returnValue;
//        return "logintest.html";
    }



    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "userlogin")
    public HashMap<String, String> userlogin(@RequestParam(required = false, defaultValue = "", value = "userid") String userid,
                                             @RequestParam(required = false, defaultValue = "", value = "userpw") String userpw,
                                             HttpServletRequest request){
        HttpSession session = request.getSession();
        HashMap<String, String> msg = new HashMap<String, String>();
//        Optional<GolfUserEntity> ggg = golfUserRepository.findOne(LoginPredicate.search(userid));
        int loginResult = loginService.loginAdmin(userid, userpw);
        if(loginResult==1){
            msg.put("loginResult", "1");
            session.setAttribute("user_signature", userid);
        }else{
            msg.put("loginResult","0");
        }
        return msg;
    }



    @GetMapping("/logout")
    public String logout(Model m, HttpServletRequest request){
        HttpSession session = request.getSession();
        // 세션에 담겨진 값 초기화
        session.invalidate();
        return "redirect:/";
    }

}
