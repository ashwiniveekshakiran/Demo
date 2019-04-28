package com.abs;

import java.util.Scanner;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a;
        Scanner sc = new Scanner(System.in);
        String animalType =sc.nextLine();
        switch (animalType) {
		case "dog":
			a = new Dog();
			break;
		case "human":
			a = new Human();
			break;
		default:
			a = new Dog();
			break;
		}
        
		System.out.println("Height :" + a.getHeight());
		System.out.println("Weight :" + a.getWeight());
		System.out.println("No of Legs:" + a.getNoOfLegs());
		
		
	}

}
