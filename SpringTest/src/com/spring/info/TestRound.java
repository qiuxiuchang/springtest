package com.spring.info;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;
@Component("suround")
public class TestRound implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		try {
			System.out.println("����ǰ��֪ͨ");
			invocation.proceed();//���д����ǰ����ǰ��֪ͨ�����Ǻ���֪ͨ
			System.out.println("���Ǻ���֪ͨ");
		}catch(Exception e){
			//�������쳣֪ͨ
			
			System.out.println("�������쳣֪ͨ");
		}
		return null;
	}

}
