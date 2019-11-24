package com.mkyong.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		/*HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();*/
		
		/*Employee e= new Employee();
		e.setFname("Xyz");
		System.out.println(e.getFname());*/
		
		
		//Person person = (Employee) context.getBean("empBean");
		
		//System.out.println("Employee emp ::"+employeeObj);
	
		//person.disply(person);
		
		Triangle triangl=(Triangle) context.getBean("lazyBean");
	
		System.out.println(triangl);
	}
}
