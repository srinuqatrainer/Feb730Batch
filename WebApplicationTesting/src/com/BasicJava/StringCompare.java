package com.BasicJava;

public class StringCompare {

	public static void main(String[] args) {

		String a="Hello";
		String b="Hello";
		
		if(a.equals(b))
		{
			System.out.println(" Both Strings are Equal");
		}
		else
		{
			System.out.println(" Both String not Equal");
		}

		System.out.println("*******************");
		
		String c="Hello";
		String d="hello";
		
		if(a.equalsIgnoreCase(b))
		{
			System.out.println(" Both Strings are Equal");
		}
		else
		{
			System.out.println(" Both String not Equal");
		}
		
System.out.println("################");
		
		String p="Hello";
		String q=" hello";
		
		if(p.equalsIgnoreCase(q))
		{
			System.out.println(" Both Strings are Equal");
		}
		else
		{
			System.out.println(" Both String not Equal");
		}
		
System.out.println("+++++++++++++++++++");
		
		String l="Hello";
		
		int stringLength=l.length();
		System.out.println(" The length of the String is : "+stringLength);

		
System.out.println("################");
		
		String k="Hello";
		String m="ello";
		
		if(m.contains(k))
		{
			System.out.println(" String existing");
		}
		else
		{
			System.out.println(" String not found");
		}

		
	}

}
