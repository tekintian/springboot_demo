package cn.tekin.springboot01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("cn.tekin.springboot01.cache.mapper")
@EnableCaching
public class Springboot01Application {
    public static void main(String[] args) {
        SpringApplication.run(Springboot01Application.class, args);
    }

}
