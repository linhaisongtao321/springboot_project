package com.lhst.springboot_project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@ServletComponentScan(value = {"com.lhst.springboot_project.common.servslet"})
@MapperScan("com.lhst.springboot_project.mapper")
public class SpringbootProjectApplication extends SpringBootServletInitializer {
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(SpringbootProjectApplication.class);
//    }

    public static void main(String[] args) {

        SpringApplication.run(SpringbootProjectApplication.class, args);
    }

}
