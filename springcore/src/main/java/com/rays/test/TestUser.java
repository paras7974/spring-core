
package com.rays.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.rays.bean.UserBean;

public class TestUser {

	public static void main(String[] args) {

		// BeanFactory factory = new XmlBeanFactory(new
		// ClassPathResource("UserBean.xml"));
		// UserBean bean = (UserBean) factory.getBean("user");
		ApplicationContext context = new ClassPathXmlApplicationContext("UserBean.xml");

		UserBean bean = (UserBean) context.getBean("user");

		System.out.println(bean.getName());
		System.out.println(bean.getLogin());
		System.out.println(bean.getPassword());

	}

}
