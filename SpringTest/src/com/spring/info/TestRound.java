package com.spring.info;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;
@Component("suround")
public class TestRound implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		try {
			System.out.println("这是前置通知");
			invocation.proceed();//这行代码的前面是前置通知后面是后置通知
			System.out.println("这是后置通知");
		}catch(Exception e){
			//这里是异常通知
			
			System.out.println("这里是异常通知");
		}
		return null;
	}

}
