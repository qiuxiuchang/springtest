package com.spring.info;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class BeforeAnotation {
    @Before("execution(public void com.spring.service.TestInfoMethod.add())")
	public void Mybefore(JoinPoint jp) {
    	
		System.out.println("ע����ʽ��ǰ��֪ͨ");
	}
    
    
    
    @AfterReturning("execution(public void com.spring.service.TestInfoMethod.add())")
    public void MyAfter() {
		System.out.println("ע����ʽ�ĺ���֪ͨ");
	}
}
