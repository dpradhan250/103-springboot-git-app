package com.example.demo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class PrintSomething {
	
	private String str1 ="User one and task 1";
	private String str2 = "User one and task 2";

}
