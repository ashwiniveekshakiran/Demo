package com.demo;

public class OverloadingOrder {
	
	public void add(int a,double b)
	{
		double sum = a+b;
		System.out.println(sum);
	}
	public void add(double a,double b)
	{
		double sum = a+b;
		System.out.println(sum);
	}

	public static void main(String ash[])
	{
		OverloadingOrder obj = new OverloadingOrder();
		obj.add(2, 0.00003);
		obj.add(0.00002, 0.00002);
	}
	
}
