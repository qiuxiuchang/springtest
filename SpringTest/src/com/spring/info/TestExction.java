package com.spring.info;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;
@Component("exection")
public class TestExction implements ThrowsAdvice{

public	void afterThrowing(Method method,Object[] obj,Object parm,Exception e) {
		System.out.println("Ŀ�����" +"method" +method.getName()+"������������"+obj.length);
	}
}
