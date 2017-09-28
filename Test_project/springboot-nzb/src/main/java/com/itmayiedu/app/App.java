package com.itmayiedu.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import com.itmayiedu.config.DBConfig1;
import com.itmayiedu.config.DBConfig2;

@ComponentScan(basePackages = { "com.itmayiedu.app", "com.itmayiedu.config", "com.itmayiedu.controller", "com.itmayiedu.exception", "com.itmayiedu.test01",
		"com.itmayiedu.test02", "com.itmayiedu.datasource" })
@MapperScan(basePackages = {"com.itmayiedu.mapper","com.itmayiedu.test01.mapping","com.itmayiedu.test02.mapping"})
@EnableConfigurationProperties(value = { DBConfig1.class, DBConfig2.class })
@EnableAutoConfiguration
@EnableCaching
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
