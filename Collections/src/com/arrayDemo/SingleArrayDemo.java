package com.arrayDemo;

public class SingleArrayDemo {

	public static void main(String[] args) {
		String Student_name[]=new String[3];
		Student_name[0]="Ashwini";
		Student_name[1]="Teju";
		Student_name[2]="Durga";
		System.out.println("Student name is:" +Student_name[2]);
		int Student_size=(int) Student_name.length;
		System.out.println("Student size is:"+Student_size);
		for(int i=0;i<Student_size;i++)
		{
			System.out.println("Student name is "+Student_name[i]);
		}

	}

}
