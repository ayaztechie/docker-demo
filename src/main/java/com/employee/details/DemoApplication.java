package com.employee.details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	public void  add(){
		System.out.println("Method");
	}
	
	@GetMapping("/hello")
	public String empDetails() {	
		
		
		
		return " Employee name is Tomer and Salary is 70000"+Constant.DATA_TYPE;
		
	}

}
