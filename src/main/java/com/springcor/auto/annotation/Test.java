package com.springcor.auto.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcor/auto/annotation/autowireconfig.xml");
		 Emp emp=con.getBean("emp1",Emp.class);
		System.out.println(emp);
	}

	
		
	
}
