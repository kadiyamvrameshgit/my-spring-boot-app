package com.kadiyam.my_spring_boot_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MySpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootAppApplication.class, args);
	}


	// test
}
