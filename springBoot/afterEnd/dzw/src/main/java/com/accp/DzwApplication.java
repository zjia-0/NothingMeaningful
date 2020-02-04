package com.accp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("/com.accp.mapper")//扫描mapper接口
public class DzwApplication {

	public static void main(String[] args) {
		SpringApplication.run(DzwApplication.class, args);
	}

}
