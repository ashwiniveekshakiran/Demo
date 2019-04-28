package com.demo;

public class OverloadingType {

	public void add(double a,double b)
	{
		double sum = a+b;
		System.out.println(sum);
	}
	public void add(int a,int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	public static void main(String ash[])
	{
		OverloadingType obj = new OverloadingType();
		obj.add(0.00004, 0.00005);
		obj.add(7,9);
	}
}
