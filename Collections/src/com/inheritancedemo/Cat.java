package com.inheritancedemo;

public class Cat {

	int getHeight()
	{
		return 50;
		
	}
	int getWeight()
	{
		return 25;
		
	}
	int getNoOfLegs()
	{
		return 4;
		
	}
	

}
class Lepord extends Cat
{
	int getHeight()
	{
		return 100;
		
	}
	int getWeight()
	{
		return 200;
		
	}
	
	
}
class Tiger extends Cat
{
	int getHeight()
	{
		return 150;
		
	}
	int getWeight()
	{
		return 250;
		
	}
}
