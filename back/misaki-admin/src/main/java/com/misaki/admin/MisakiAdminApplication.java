package com.misaki.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;


//@SpringBootApplication
@SpringBootApplication
@ServletComponentScan
//@MapperScan("com.misaki.admin.mapper")
//@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
@MapperScan("com.misaki.admin.mapper")
public class MisakiAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MisakiAdminApplication.class, args);
	}

}
