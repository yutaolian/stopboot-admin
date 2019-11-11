package com.stopboot.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @version:0.1
 * @author: Lianyutao
 * @create: 2019/11/11
 * @description: StopBootAdminApplication
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class StopBootAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(StopBootAdminApplication.class, args);
    }

}
