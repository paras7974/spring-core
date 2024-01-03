package com.rays.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rays.bean.Person;
import com.rays.bean.UserBean;

public class TestMultiple {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Multiple.xml");
		    
	   UserBean bean =  (UserBean) context.getBean("user");
	   
	   Person person = (Person) context.getBean("PersonBean");
	   
	   System.out.println("User Name: " + bean.getLogin());
	   System.out.println("User Password: " + bean.getPassword());
	   System.out.println("Person Name: " + person.getName());
		
	}

}
