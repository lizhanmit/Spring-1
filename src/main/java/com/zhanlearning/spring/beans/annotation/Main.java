package com.zhanlearning.spring.beans.annotation;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhanlearning.spring.beans.annotation.controller.UserController;
import com.zhanlearning.spring.beans.annotation.repository.UserRepository;
import com.zhanlearning.spring.beans.annotation.service.UserService;



public class Main {

	public static void main(String[] args) {

		// ApplicationContext is the IOC container of Spring
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
		
//		TestOject testOject = (TestOject) ctx.getBean("testOject");
//		System.out.println(testOject);
//
		UserController userController = (UserController) ctx.getBean("userController");
		System.out.println(userController);
		userController.execute();
//		
//		UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");
//		System.out.println(userRepository);
		
//		UserService userService = (UserService) ctx.getBean("userService");
//		System.out.println(userService);
	}
}
