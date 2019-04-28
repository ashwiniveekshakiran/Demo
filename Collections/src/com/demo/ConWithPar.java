package com.demo;

public class ConWithPar {
	int id;
	String name;
	public ConWithPar(int i,String s) {
		id=i;
		name=s;
		System.out.println(id+ " " +name);
	}
	public static void main(String args[])
	{
		ConWithPar obj =new ConWithPar(1276, "Ashwini");
		ConWithPar obj1 = new ConWithPar(1271, "Tejaswini");
		ConWithPar obj2 = new ConWithPar(1273, "DurgaBhavani");
		
	}
	}
