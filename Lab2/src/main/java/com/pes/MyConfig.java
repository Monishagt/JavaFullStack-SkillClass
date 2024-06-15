package com.pes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	@Bean(name="Anya")
public A createA() {
		A a=new A();
		a.setA(20);
		a.setMessage("How are u??");
	return a;
}
	@Bean(name="Nay")
	public B createB() {
		B b=new B();
		b.setB(17);
		b.setMessage("Fine,Thank You!!");
		return b;
		
	}
	@Bean(name="Paz")
	public Hello createHello(A a,B b)
	{
		Hello h=new Hello(b);
		h.setAobj(a);
		return h;
	}
}