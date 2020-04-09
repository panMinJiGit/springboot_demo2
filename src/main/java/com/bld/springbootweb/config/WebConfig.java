package com.bld.springbootweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
/**
 * 扩展MVC
 * 配好拦截器，我们需要将拦截器交个WebMvc容器管理
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

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
                .addResourceLocations("classpath:/public/");
        super.addResourceHandlers(registry);
    }


    
}
