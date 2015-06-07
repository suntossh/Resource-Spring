package com.suntossh.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");

	BeanA beanA = context.getBean("beanAID", BeanA.class);
	
	System.out.println(beanA.getAccessBean().getBeanName());
	
	}
}
