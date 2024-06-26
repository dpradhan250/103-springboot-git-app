package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		
		System.out.println(context.getBean(PrintSomething.class).getStr1());
		System.out.println(
				context.getBean(PrintSomething.class).getStr2());
		
		//for task HIS-1444
		context.getBeanDefinitionNames();
		
		
	}

}
