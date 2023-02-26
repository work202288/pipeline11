package com.ch.ch6_4;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;

@SpringBootApplication
public class Ch64Application {

	public static void main(String[] args) {
		SpringApplication.run(Ch64Application.class, args);
	}

}
