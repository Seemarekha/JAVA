package com.inheritance.Single_Level;

class B{
	void m1()
	{
		System.out.println("M1 method is called");
	}
	
}
public class A extends B {
	void m2()
	{
		System.out.println("M2 method is called");
	}
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		a.m2();
	}
}
