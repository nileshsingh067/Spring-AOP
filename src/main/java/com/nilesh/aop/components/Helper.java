package com.nilesh.aop.components;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Helper {

	//@Before(value = "execution(* com.nilesh.aop.components.*.*(..))")//advice
	@Before("methodNotifier()")//advice
	public void methodCalled() {
		
		System.out.println("Method Called");
	}
	
	//if method have argumrnts the put .. for zero and more argument and put * for one of more argument in between ( )
	
	//@After(value = "execution(* com.nilesh.aop.components.*.*(..))")//advice without using point cut
	//@After("methodNotifier()")//advice with point cut
	@After(value = "execution(public void com.nilesh.aop.components.*.*())")//method specific advice-restrict to a method
	public void methodEnd() {
		
		System.out.println("Logger End -New");
	}
	
	@Pointcut("execution(* com.nilesh.aop.components.*.*(..))")
	public void methodNotifier() {}
	

	@Before(value = "execution(public void com.nilesh.aop.components.Employee.*(..))")
	public void empNotifier(JoinPoint joinPoint) {

		System.out.println("Employee.getEmployee() Called :: "+joinPoint.toString());
		System.out.println("Employee.getEmployee() Called :: "+Arrays.toString(joinPoint.getArgs()));
	}
	
	
	
}
