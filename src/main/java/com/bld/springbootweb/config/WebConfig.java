package com.bld.springbootweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Arrays;
import java.util.List;

/**
 * 扩展MVC
 * 配好拦截器，我们需要将拦截器交个WebMvc容器管理
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {



    private static final List<String> EXCLUDE_PATH= Arrays.asList("/","/css/**","/js/**","/images/**","/assets/**","/vendors/**","/media/**");

    public WebConfig(){
        super();
    }

    /**
     * 如果请求为"/",需要跳转到登录页面
     * 可以方便的将一个请求映射成视图，无需书写控制器，addViewCOntroller("请求路径").setViewName("请求页面文件路径")
     * @param registry
     */
    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login_soft");
    }

    /**
     * 配置拦截器 -> 拦截所有请求
     * @param registry
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns(EXCLUDE_PATH)
                .excludePathPatterns("/login")
                .excludePathPatterns("/user/login")
                .excludePathPatterns("/favicon.ico");
        super.addInterceptors(registry);
    }


    /**
     * 分析原因：添加了拦截器导致默认的register被覆盖，默认的静态资源位置也被覆盖
     * 解决办法：
     * 添加静态资源路径,不然会加载不了静态资源
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/resources/")
                .addResourceLocations("classpath:/static/")
                .addResourceLocations("classpath:/public/")
                .addResourceLocations("classpath:/WEB-INF/resources/images/")
                .addResourceLocations("classpath:./WEB-INF/resources/js/")
                .addResourceLocations("classpath:/WEB-INF/resources/css/")
                .addResourceLocations("/favicon.ico");
        super.addResourceHandlers(registry);
    }


    /**
     * 配置返回jsp路径
     * @return
     */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }






}
