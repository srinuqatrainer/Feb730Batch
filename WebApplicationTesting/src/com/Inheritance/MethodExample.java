package com.Inheritance;

public class MethodExample {
	
	
	int a=20;
	int b=10;
	int c;
	
	public void add()
	{
		c=a+b;
		System.out.println(" The addition of a and b is : "+c);
	}
	
	public void subtraction()
	{
		c=a-b;
		System.out.println(" The subtraction of a and b is : "+c);
	}
	

	public void multiplication()
	{
		c=a*b;
		System.out.println(" The multiplication of a and b is : "+c);
	}
	
	public void division()
	{
		c=a/b;
		System.out.println(" The division of a and b is : "+c);
	}

	public static void main(String[] args) {
		
		MethodExample m = new MethodExample();
		
		m.add();
		m.subtraction();
		m.multiplication();
		m.division();

	}

}
