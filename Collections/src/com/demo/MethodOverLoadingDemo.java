package com.demo;

public class MethodOverLoadingDemo {

	
	public void add(int a,int b)
	{
		int sum = a+b;
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)
	{
		int sum = a+b+c;
		System.out.println(sum);
	}
	public static void main(String ash[])
	{
		MethodOverLoadingDemo obj = new MethodOverLoadingDemo();
		obj.add(5, 6);
		obj.add(6, 7, 8);
	}
}
