package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/auto/wire/autowireconfig.xml");
		 Emp emp=con.getBean("emp1",Emp.class);
		System.out.println(emp);
	}

	
		
	
}
