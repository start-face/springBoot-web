package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author FaceFeel
 * @Created 2018-04-17 11:23
 **/

@SpringBootApplication
public class AppRun {

    public static void main(String[] args) {

        //项目启动:mvn spring-boot:run
        SpringApplication.run(AppRun.class,args);
    }
}
