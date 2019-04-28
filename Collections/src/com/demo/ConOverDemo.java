package com.demo;

public class ConOverDemo {

	int id;
	String name;

ConOverDemo()
{
	int id = 1276;
	
	
	String name = "Ashwini";
	System.out.println(id+ " " +name);
	}

ConOverDemo(int i)
{
	id=i;
System.out.println(id);
	}
ConOverDemo(int i,String s)
{
	id=i;
	name=s;
	System.out.println(id+ " " +name);
			}
public static void main(String args[])
{
	ConOverDemo obj = new ConOverDemo();
	ConOverDemo obj1 = new ConOverDemo(2);
	ConOverDemo obj2 = new ConOverDemo(2, "Ashwini");
	
	}
}