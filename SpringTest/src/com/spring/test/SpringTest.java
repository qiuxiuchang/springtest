package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.entity.Course;
import com.spring.service.TestInfoMethod;

public class SpringTest {

	public static void testAutowire() {
		ApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Course cou	=(Course)Context.getBean("course");
		System.out.println(cou);
	}
	public static void main(String[] args) {
		ApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestInfoMethod tf=(TestInfoMethod)Context.getBean("foMethod");
		tf.add();
		
	}
}
