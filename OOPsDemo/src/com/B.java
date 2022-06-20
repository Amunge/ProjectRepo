package com;

public class B extends A{
	int a=100;
	void show ()
	{
		super.show();
		System.out.println("hello Learner");
		System.out.println(a);
		System.out.println(super.a);
		
	}
	B()
	{
		System.out.println("Constructor from b class");
	}
	
	public static void main(String[] args)
	{
		B b=new B();
		b.show();
		
		
	}

}
