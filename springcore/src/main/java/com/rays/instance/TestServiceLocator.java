package com.rays.instance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestServiceLocator {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Instance.xml");
		
		ServiceLocator serviceLocator = (ServiceLocator) context.getBean("locator");
		
		serviceLocator.getInstance();
		
		
	}

}
