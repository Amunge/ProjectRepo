package com;

public class B3 extends A3 {
	int a=500;
	public void show()
	{
		super.show();
		int a=100,b=10;
		int c=a*b;
		System.out.println(c);
		
		System.out.println(this.a);
		System.out.println(super.a);
        		
	}
	B3()
	{
		super("ANNASO");
		System.out.println("B3 Contructor");
	}

	public static void main(String[] args) {
		B3 b=new B3();
		b.show();
		
		

	}

}
