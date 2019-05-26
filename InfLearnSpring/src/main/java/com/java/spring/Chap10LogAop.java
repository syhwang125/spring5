package com.java.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Chap10LogAop {
	
//	@Pointcut("within(com.java.spring.*)")
	@Pointcut("execution(* com.java.spring.*.*())")
	private void pointcutMethod() {
	}
	
	@Around("pointcutMethod()")
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println(signatureStr + " is start");
		long st = System.currentTimeMillis();
		
		try {
			Object obj = joinpoint.proceed();
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished ");
			System.out.println(signatureStr + " estimate time " + (et - st));
			System.out.println("=====================");
		}
	}

	@Before("within(com.java.spring.*)")
	public void beforeAdvice() {
		System.out.println("beforeAdvice");
	}
}
