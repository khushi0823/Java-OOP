package com.product;

import java.util.Scanner;

public class Productinfo {
	Scanner sc = new Scanner(System.in);
	Product1[] parr = new Product1[10];
	int count=0;

	public void insert() {
		if(count<parr.length) {
			Product1 pobj = new Product1();
			System.out.println("Enter name");
			pobj.setName(sc.next());
			System.out.println("Enter price: $");
			pobj.setPrice(sc.nextDouble());
			System.out.println("Enter initial stock quantity: ");
			pobj.setStocks(sc.nextInt());
			parr[count]=pobj;
			count++;
			System.out.println("Medicine entered successfully!");


		}
	}

	public void updateMedicineStock() {
		System.out.println("Enter medicine name to update stock: ");
		String searchName = sc.next();

		for (int i = 0; i < count; i++) {
			if (parr[i].getName().equalsIgnoreCase(searchName)) {
				System.out.println("Enter the quantity to add to stock: ");
				int quantity = sc.nextInt();
				parr[i].setStocks(parr[i].getStocks() + quantity);
				System.out.println("Stock updated successfully!");
				return;
			}
		}
		System.out.println("Medicine not found!");
	}
	public void displayMedicines() {
		System.out.println("Medicine Name\tPrice\tStock");
		for (int i = 0; i < count; i++) {
			System.out.println(parr[i].getName() + "\t$" +
					parr[i].getPrice() + "\t" +
					parr[i].getStocks());
		}
	}

	public double getMedicinePrice() {
		System.out.println("Enter medicine name to get price: ");
		String searchName = sc.next();

		for (int i = 0; i < count; i++) {
			if (parr[i].getName().equalsIgnoreCase(searchName)) {
				return parr[i].getPrice();
			}
		}
		System.out.println("Medicine not found!");
		return -1; // Return a negative value to indicate failure.
	}


}
