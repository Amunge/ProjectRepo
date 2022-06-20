package com;

public class Child1 extends Parent1
{
	Child1(String msg)
	{
		super(msg);
		System.out.println("Param of child "+msg);

	}
	int a=200;
	public void test()
	{
		System.out.println("Test of Child ");
		System.out.println(this.a);
		System.out.println(super.a);
		super.test();
	}
	

	public static void main(String[] args) {

		Child1 obj=new Child1("Hello Java");
		obj.test();
		System.out.println(obj.a);
	}

}
