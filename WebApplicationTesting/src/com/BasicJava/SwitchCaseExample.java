package com.BasicJava;

public class SwitchCaseExample {

	public static void main(String[] args) {
		
		int number = 50;
		
		switch(number)
		{
		case 10:
			System.out.println("10");
			break;
		
		case 20:
			System.out.println("20");
			break;
			
		case 30:
			System.out.println("30");
			break;
			
		default:
			System.out.println(" not existing in 10,20 and 30");
			break;
		}

	}

}
