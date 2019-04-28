package com.inheritancedemo;

import java.util.Scanner;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Which cat :");
		Scanner sc = new Scanner(System.in);
		String catType = sc.nextLine();
		// String name = "ashwini";
		// name.length();
		// "ashwini".length();

		// Cat cat = new Cat();
		// cat.getHeight();
		// new Cat().getHeight();
		// new Tiger().getHeight();

		String name;

		name = "ashwini";
		System.out.println(name);

		Object cat1 = new Tiger();

		Cat cat = null;
		System.out.println(catType);
		// if(catType.equalsIgnoreCase("tiger"))
		// {
		// cat = new Tiger();
		// }
		// else if(catType.equalsIgnoreCase("lepord"))
		// {
		// cat = new Lepord();
		// }
		// else
		// {
		// cat = new Cat();
		// }

		switch (catType) {
		case "tiger":
			cat = new Tiger();
			break;
		case "lepord":
			cat = new Lepord();
			break;

		default:
			cat = new Cat();

			break;
		}
		System.out.println("Height : " + cat.getHeight());
		System.out.println("Weight : " + cat.getWeight());
		System.out.println("No Of Legs :" + cat.getNoOfLegs());

	}

}
