package com.nandulabs.core.java.basics;

public class MyFirstJavaProgram {

	private String name = "Narendra Sahu"; // instance variable
	private static String address = "Hyderabad"; // static variable

	{
		System.out.println("Inside instance block");
	}
	
	static {
		System.out.println("Inside static block");
	}
	
	public MyFirstJavaProgram() {
		System.out.println("Inside default constructor");
	}
	
	public static void main(String[] args) {

		MyFirstJavaProgram firstJavaProgram = new MyFirstJavaProgram();
		
		{
			final String name = "Santosh";
			System.out.println("Block scope "+ name);
		}
		
		final String name = "Narendra"; // local variable

		System.out.println("Hello World " + name + " "+ address);
		
	}

}
