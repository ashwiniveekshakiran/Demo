package com.demo;

public class A {

	public static void add(int a, int b)
	{
	
		int c = a+b;
		System.out.println(c);
		
	}
	
}
class B extends A
{
	public static void add(int a, int b)
	{
		
		int c = b*a;
		System.out.println(c);
		
	}}
class C extends B


{
	public static void mul()
	{
		int a = 12;
		int b = 13;
		int c = a*b;
		System.out.println(c);
	}}
class D
{
	public static void main(String ash[])
	{
B.add(4,5);
A.add(4,5);
		
	}}
