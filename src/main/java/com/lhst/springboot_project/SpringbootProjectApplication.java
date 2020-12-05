package com.lhst.springboot_project;

import com.lhst.springboot_project.util.RedisUtil;
import com.lhst.springboot_project.util.SpringContextUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

//import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@ServletComponentScan(value = {"com.lhst.springboot_project.common.servslet"})
@MapperScan("com.lhst.springboot_project.mapper")
public class SpringbootProjectApplication {
//    extends SpringBootServletInitializer
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(SpringbootProjectApplication.class);
//    }

    public static void main(String[] args) {

        SpringApplication.run(SpringbootProjectApplication.class, args);
}

}
