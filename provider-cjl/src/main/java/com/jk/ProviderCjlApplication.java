package com.jk;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.jk.dao")
@EnableDubboConfiguration
public class ProviderCjlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderCjlApplication.class, args);
    }

}
