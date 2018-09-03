package com.ipaynow.springboot.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:spring-dubbo-consumer.xml"})
public class SpringbootDemoConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoConsumerApplication.class, args);
	}
}
