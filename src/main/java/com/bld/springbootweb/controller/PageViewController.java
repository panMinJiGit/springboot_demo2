package com.bld.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 */
@Controller
public class PageViewController {

    @RequestMapping("/login")
    public String login_view(){
        return "login_soft";
    }

    @RequestMapping("/index")
    public String index_view(){
        return "index";
    }


    @RequestMapping("/layout_horizontal_sidebar_menu")
    public String layout_horizontal_sidebar_menu(){
        return "layout_horizontal_sidebar_menu";
    }

    @RequestMapping("/charts")
    public String charts(){
        return "charts";
    }

}
