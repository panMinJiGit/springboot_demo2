<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<div class="page-sidebar nav-collapse collapse">
    <ul class="page-sidebar-menu" id="ui_css_active">
        <li>
            <div class="sidebar-toggler hidden-phone"></div>
        </li>
        <li>
            <form class="sidebar-search">
                <div class="input-box">
                    <a href="javascript:;" class="remove"></a>
                    <input type="text" placeholder="Search..." />
                    <input type="button" class="submit" value=" " />
                </div>
            </form>
        </li>

        <li class="start active ">
            <a href="index">
                <i class="icon-home"></i>
                <span class="title">首页</span>
                <span class="selected"></span>
            </a>
        </li>

        <li class="">
            <a href="javascript:;">
                <i class="icon-gift"></i>
                <span class="title">用户</span>
                <span class="arrow "></span>
            </a>
            <ul class="sub-menu">
                <li >
                    <a href="extra_profile.html">User Profile</a>
                </li>
                <li >
                    <a href="extra_lock.html">Lock Screen</a>
                </li>
            </ul>
        </li>
        <li>
            <a class="active" href="javascript:;">
                <i class="icon-sitemap"></i>
                <span class="title">一级菜单</span>
                <span class="arrow "></span>
            </a>
            <ul class="sub-menu">
                <li>
                    <a href="javascript:;">Item 1<span class="arrow"></span></a>
                    <ul class="sub-menu">
                        <li><a href="#">Sample Link 1</a></li>
                        <li><a href="#">Sample Link 2</a></li>
                        <li><a href="#">Sample Link 3</a></li>
                    </ul>
                </li>
                <li>
                    <a href="javascript:;">Item 1<span class="arrow"></span></a>
                    <ul class="sub-menu">
                        <li><a href="#">Sample Link 1</a></li>
                    </ul>
                </li>
            </ul>
        </li>

        <li class="">
            <a href="javascript:;">
                <i class="icon-user"></i>
                <span class="title">登录菜单</span>
                <span class="arrow "></span>
            </a>
            <ul class="sub-menu">
                <li >
                    <a href="login.html">Login Form 1</a>
                </li>
            </ul>
        </li>

        <li class="last " id="charts">
            <a href="charts">
                <i class="icon-bar-chart"></i>
                <span class="title">可视化视图</span>
            </a>
        </li>
    </ul>
</div>

<script src="media/js/jquery-1.10.1.min.js" type="text/javascript"></script>
<script type="text/javascript">

    $(function(){

        $("#ui_css_active li").click(function() {
            $(this).siblings('li').removeClass('active');
            $(this).addClass('active');
        });

    });
</script>



</html>
