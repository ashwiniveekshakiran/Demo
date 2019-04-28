package com.arraylistdemo;
import java.util.ArrayList;
public class ArraylistDemo {
	public static void main(String[] args) {
		ArrayList<String> ilist = new ArrayList<String>();
		ilist.add("Geetha");
		ilist.add("Seetha");
		ilist.add("Reeta");
		ilist.add("neeta");
		ilist.add("Beeta");
		ilist.remove(4);
		ilist.add(4, "maduri");
		System.out.println("this is a arrylist "+ilist);
		System.out.println(ilist.size());
	
		
		
		for(String s:ilist)
	{
			System.out.println("iterator arraylist is "+s);
	}
		}
		
	} 


