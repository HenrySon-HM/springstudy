package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect //pointcut + Advice
public class LogAdvice {
		@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")  //pointcut
		public void allPointcut() {}
		
		@Before("allPointcut()")	//Advice
		public void printLog() {
		System.out.println("[����α�] �����Ͻ� ���� ���� �� ����");
		}
}

