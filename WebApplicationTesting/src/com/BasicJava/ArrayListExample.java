package com.BasicJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<Object>a = new ArrayList<>();
		
		a.add("Selenium");
		a.add("LoadRunner");
		a.add("QTP/UFT");
		a.add(100);
		a.add(10.123);
		
		//System.out.println(a.get(0));
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	
	}

}
