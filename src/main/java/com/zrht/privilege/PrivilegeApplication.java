package com.zrht.privilege;

import com.cloud.common.annotation.SpringCloudWebApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringCloudWebApplication
@MapperScan("com.zrht.privilege.dao")
public class PrivilegeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrivilegeApplication.class, args);
    }

}
