package com.springcore.sterio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/sterio/sterio.xml");
		
      Adress a=con.getBean("adress",Adress.class);
      System.out.println(a);
	
	}	
	
}
