package com.springcore.collectionss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
      
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/collectionss/collectioncongif.xml");
	Employee emp=(Employee) context.getBean("Emp");

	
	System.out.println(emp.getName());
	System.out.println(emp.getPhones());
	System.out.println(emp.getAddresss());
	System.out.println(emp.getCourses());
	}

}
