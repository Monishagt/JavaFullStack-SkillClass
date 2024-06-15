package com.pes;

public class A {
	private int a;
	 private String message;
	 
	public int getA() {
		return a;
	}
	
	public A()
	{
		System.out.println("Default constuctor A");
	}
	public void setA(int a) {
		this.a=a;
		System.out.println("A class setter for A");
	}
	public A(int a,String message) {
		System.out.println("Constructor is executed");
	}
	public String getMessage() {
		System.out.println("A class setter for message");
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	 public void showA()
	 {
		 System.out.println("A show methods ");
		 System.out.println(a);
		 System.out.println(message);
	 }


}
