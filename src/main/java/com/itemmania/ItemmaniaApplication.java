package com.itemmania;

import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
@MapperScan
public class ItemmaniaApplication {

    public static void main(String[] args) {
        log.info("테스트용 문자");
        SpringApplication.run(ItemmaniaApplication.class, args);
    }

}
