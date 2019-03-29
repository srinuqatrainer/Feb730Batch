package com.BasicJava;

public class Method1 {
	
	public void test1()
	{
		System.out.println(" Test1 method executed Successfully ");
	}
	
	public void test2()
	{
		System.out.println(" Test2 method executed Successfully ");
	}

	public static void main(String[] args) {
		
		// creating an object to the Class
		Method1 m = new Method1();
		
		// using Object created for the current class - calling the methods
		m.test1();
		m.test2();

	}

}
