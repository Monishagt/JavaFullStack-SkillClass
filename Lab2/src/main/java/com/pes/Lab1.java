package com.pes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab1 {
public static void main(String[] args) {
	ApplicationContext ctx= new AnnotationConfigApplicationContext(MyConfig.class);
	//A a= (A) ctx.getBean("Anya");
	//a.showA();
	//B b= (B) ctx.getBean("Nay");
	//b.showB();
	Hello c=(Hello) ctx.getBean("Paz");
	c.show();
	
}
}