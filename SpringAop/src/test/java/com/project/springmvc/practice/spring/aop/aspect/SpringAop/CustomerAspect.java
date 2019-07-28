package com.project.springmvc.practice.spring.aop.aspect.SpringAop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CustomerAspect {
	
	@Before("execution(public int display*(..))")
	public void show1()
	{
		System.out.println("Before executing method");
	}
	
	@After("execution(public int get*(..))")   
	public void print1() throws Throwable 
	{ 
		System.out.println("After method");
	}
	
	@Around("execution(public int getValue(..))")   
	public int print3(ProceedingJoinPoint proceedingJoinPoint) throws Throwable 
	{ 
		System.out.println("before method");
		int i=(int) proceedingJoinPoint.proceed(); //it will execute target method
		System.out.println("After executing method");
		System.out.println("Around values is"+i);
		return i*10;
	}
	
	
	@AfterThrowing(pointcut="execution(public void display*(..))", throwing="th")
	public void print2(Exception th)                                                       
	{
		System.out.println("Exception is:"+th.getMessage());
		System.out.println("After Throwing Exception");
		
	}


	@Before("execution(public int get*(..))")
	public void show()
	{
		System.out.println("Before executing method");
	}
	
//	@AfterReturning("execution(public int get*(..))")
//	public void print()
//	{
//		
//		System.out.println("After executing method");
//	}

	@AfterReturning(pointcut="execution(public int get*(..))",returning="r")
	public void print( int r)
	{
		System.out.println("Value after method call"+r);
		System.out.println("After return method");
	}
	
//	output sequence is 
//	@around
//	@before
//	@target method(get of customer class)
//	@around
//	@after
//	@afterreturning
//	@print the value
}
