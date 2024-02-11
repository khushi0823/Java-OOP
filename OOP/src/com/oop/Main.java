package com.oop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Studentinfo obj = new Studentinfo();
		Scanner sc = new Scanner(System.in);
		int ch,ch1;
		
		do {
			System.out.println("1.Insert\n2.Display");
			ch=sc.nextInt();
			
			
			switch (ch) {
			case 1:
				obj.insert();

				break;
			case 2:
				obj.display();
				break;


			default:
				System.out.println("Invalid Choice");
				break;
			}

			System.out.println("Enter choice : 1/0");
			ch1=sc.nextInt();

		}while(ch1==1);


	}

}
