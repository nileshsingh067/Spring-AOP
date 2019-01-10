package com.nilesh.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nilesh.aop.components.Employee;

@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext config=SpringApplication.run(SpringAopApplication.class, args);
		Employee empObj=config.getBean(Employee.class);
		empObj.show();
		empObj.getEmployee("kumar");
//		Employee empObj2=config.getBean(Employee.class);
//		empObj2.show();
	}
}
