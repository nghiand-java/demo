package com.example.demo.config;//package config;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@RequiredArgsConstructor
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {


    // Override
    // ------------------------------------------------------------------------
    @Override public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoggingHandlerInterceptorAdaptor(tracer))
//            .addPathPatterns("/**").excludePathPatterns("/health");

    }

//    @Bean
//    public FilterRegistrationBean loggingFilter() {
//        FilterRegistrationBean bean = new FilterRegistrationBean(new RequestIdFilter());
//        bean.addUrlPatterns("/*");
//        bean.setOrder(Integer.MIN_VALUE);
//        return bean;
//    }

}
