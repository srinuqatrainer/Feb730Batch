package com.BasicJava;

public class ExceptionHandling {

	public static void main(String[] args) {
				
		int a=20;
		int b=0;
		int c;
		
		try
		{
			c=a/b;
			System.out.println(" The value of c is : "+c);
		}
		catch(Exception e)
		{
			System.out.println(" Cannot perform the operation ");
			System.out.println(" the expection is : "+e);
		}

	}

}
