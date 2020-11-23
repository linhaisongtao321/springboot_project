package com.lhst.springboot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@ServletComponentScan(value = {"com.lhst.springboot_project.common.servslet"})
@EnableCaching
//@MapperScanScan("com.lhst.springboot_project.mapper")
public class SpringbootProjectApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootProjectApplication.class);
    }

//    public static void main(String[] args) {
//
//        SpringApplication.run(SpringbootProjectApplication.class, args);
//    }

}
