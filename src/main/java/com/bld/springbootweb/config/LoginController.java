package com.bld.springbootweb.config;

import com.bld.springbootweb.entity.UserInfoEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping("user/login")
    @ResponseBody
    public Map login(HttpServletRequest request, HttpServletResponse response, HttpSession session, String username, String password) {

        Map<String,Object> map = new HashMap<String, Object>();
        System.out.println("获取用户名：" + username);
        System.out.println("获取密码："+ password);
       UserInfoEntity loginUser = new UserInfoEntity();
        if(username.equals("admin") && password.equals("admin")){
            loginUser.setUserName(username);
            loginUser.setPassword(password);
            session.setAttribute("loginUser",loginUser);
            map.put("msg","登录成功");
            map.put("status",200);
            //response.sendRedirect("/index");
            return map;
        }else{
            map.put("msg","用户名或密码不对");
            map.put("status",400);
        }
        return map;
    }



}
