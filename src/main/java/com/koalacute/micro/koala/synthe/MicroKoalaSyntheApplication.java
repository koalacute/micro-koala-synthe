package com.koalacute.micro.koala.synthe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.koalacute.micro.koala.synthe.mapper")
@ComponentScan({"com.koalacute.micro"})
@PropertySource(value = "classpath:/config/*.yml", ignoreResourceNotFound = true)
public class MicroKoalaSyntheApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroKoalaSyntheApplication.class, args);
    }

}
