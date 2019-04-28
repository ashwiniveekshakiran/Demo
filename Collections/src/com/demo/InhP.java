package com.demo;

public class InhP {
void add()
{
	System.out.println("Addition");
	}
void sub()
{
	System.out.println("Sustraction");
	}
}
class InhC extends InhP
{
	void mul()
	{
		System.out.println("Multiplication");
	}
	 void div()
	 {
		 System.out.println("Division");
	 }
	 
	

public static void main(String args[])
{
	InhP p = new InhP();
	p.add();
	p.sub();
	InhC c = new InhC();
	c.add();
	c.sub();
	c.mul();
	c.div();
	
	}}


