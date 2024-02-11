package com.product;

import java.util.Scanner;

public class ProMain {

	public static void main(String[] args) {
		Productinfo med = new Productinfo();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n1. Insert Medicine\n2. Update Medicine Stock\n3. Display Medicines\n4. Get Medicine Price\n5. Exit");
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				med.insert();
				break;

			case 2:
				med.updateMedicineStock();
				break;

			case 3:
				med.displayMedicines();
				break;

			case 4:
				double price =  med.getMedicinePrice();
				if (price >= 0) {
					System.out.println("Medicine Price: $" + price);
				}
				break;

			case 5:
				System.out.println("Exiting the program. Thank you!");
				System.exit(0);

			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}



	}

}
