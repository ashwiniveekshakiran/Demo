package com.demo;

public class OverridingDemo {
public void Dishes() 
{
	System.out.println("Manchuria");
}
public void Cooldrink()
{
	System.out.println("Maaza");
	}
}
class Overriding extends OverridingDemo
{
	public void Cooldrink()
	{
		System.out.println("Fanta");
	}
	public static void main(String ash[])
	{
		OverridingDemo obj = new Overriding();
		obj.Dishes();
		
		Overriding obj1 = new Overriding();
		obj1.Cooldrink();
	}
	}
