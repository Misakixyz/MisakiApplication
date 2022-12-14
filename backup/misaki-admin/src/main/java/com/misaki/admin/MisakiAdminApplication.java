package com.misaki.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.boot.web.servlet.ServletComponentScan;


//@SpringBootApplication
@EnableDiscoveryClient
@SpringBootApplication//(scanBasePackages={"com.misaki.admin"})
@ServletComponentScan
//@MapperScan("com.misaki.admin.dao")
public class MisakiAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MisakiAdminApplication.class, args);
	}

}
