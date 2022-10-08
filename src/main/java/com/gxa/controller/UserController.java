package com.gxa.controller;

import com.gxa.entity.TableResult;
import com.gxa.entity.User;
import com.gxa.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/user/login")
    public TableResult login(User user, HttpSession session){

        System.out.println(user);


//       User u  = this.userService.login(user.getUserName(), user.getPwd());
//        if(u != null){
//            //登录成功 ，将用户信息放在session中
//            session.setAttribute("user",u);
//
//            return "redirect:/main.html";
//        }else{
//            return "redirect:/index.html";
//        }
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(),user.getPwd());
        TableResult result = new TableResult(0,"suc",0,null);
        try{

            subject.login(token);
            //登录成功
            System.out.println(result);
            return result;
        }catch (Exception e){
            e.printStackTrace();
            result.setCode(1);
            //登录失败
            return result;
        }
    }


    @GetMapping("/user/logout")
    public String logout(HttpSession session){
        session.invalidate();

        return "redirect:/index.html";

    }



}
