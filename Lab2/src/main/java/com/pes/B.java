package com.pes;

public class B {
	private int b;
	private String message;
	public B()
	{
		System.out.println("default constructor of B");
	}
	public B(int b, String message) {
		System.out.println("Constructor B");
	}
	public int getB(int b) {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void showB()
	{
		System.out.println("show B");
		System.out.println("b=" +b);
		System.out.println("message="+message);
	}

}
