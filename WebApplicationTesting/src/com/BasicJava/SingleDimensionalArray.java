package com.BasicJava;

public class SingleDimensionalArray {

	public static void main(String[] args) {
	
		int a[] = new int[3];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		//a[3] = 40;
		
		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);*/
		
		//for(int i=0;i<3;i++)
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		// Size of the Array is fixed
		// It can save only similar dataType Values
		// if an index of an array is not save with any value then there is a wasted of memory
		
	}

}
