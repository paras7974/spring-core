package com.rays.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBean {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Lifecycle.xml");
		
		  MyBean myBean =  (MyBean) context.getBean("myBean");
		  
		  ((ClassPathXmlApplicationContext) context).close();
		  
		  
	}

}
