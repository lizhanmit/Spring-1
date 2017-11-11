package com.zhanlearning.spring.beans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhanlearning.spring.beans.autowire.Address;
import com.zhanlearning.spring.beans.autowire.Car;
import com.zhanlearning.spring.beans.autowire.Person;


public class Main {

	public static void main(String[] args) {

		// ApplicationContext is the IOC container of Spring
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");
		
		Car car = (Car) ctx.getBean("car");
		Car car2 = (Car) ctx.getBean("car");
		System.out.println(car == car2);

	}
}
