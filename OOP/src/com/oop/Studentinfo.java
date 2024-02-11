package com.oop;

import java.util.Scanner;

public class Studentinfo {
	Scanner sc=new Scanner(System.in);
	Student[] students = new Student[10];
	int count=0;


	public void insert() {
		if(count< students.length) {
			Student sobj=new Student();
			System.out.println("Enter roll no ");
			sobj.setRollno(sc.nextInt());
			System.out.println("Enter name");
			sobj.setName(sc.next());
			System.out.println("Enter departmnent");
			sobj.setDept(sc.next());
			students[count] = sobj;
            count++;
            System.out.println("Student record inserted successfully!");

			
		}
		
	}
	public void display() {
		System.out.println("Rollno\tName\tDepartmnent ");
		for (int i = 0; i < count; i++) {
            System.out.println(students[i].getRollno() + "\t" + students[i].getName() + "\t" + students[i].getDept());
		
	}
	}
		
		
	
	
}

