package com.Inheritance;

public class SubChildClass extends ChildClass {
	
	public void test4()
	{
		System.out.println(" Test4 method executed Successfully ");
	}

	public static void main(String[] args) {
		
		SubChildClass scc = new SubChildClass();
		
		scc.test4();
		scc.test1();
		scc.test2();
		scc.test3();

	}

}
