package com.zhanlearning.spring.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {

		// ApplicationContext is the IOC container of Spring
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-autowire.xml");
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);

	}
}
