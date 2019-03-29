package com.BasicJava;

public class ForEachLoopExample {

	public static void main(String[] args) {
		
		Object a[] = new Object[3];
		
		a[0] = 10;
		a[1] = "Srini";
		a[2] = 10.123;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("*************************");
		
		// for each loop
		for(Object var:a)
		{
			System.out.println(var);
		}

	}

}
