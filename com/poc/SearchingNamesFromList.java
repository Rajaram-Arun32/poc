package com.poc;

import java.util.Scanner;

public class SearchingNamesFromList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Customers");
		int n = sc.nextInt();
		sc.nextLine();
		String[] customer = new String[n];
		for (int i = 0; i < n; i++) {
			customer[i] = sc.nextLine();
		}
		System.out.println("Serach the name of customer");
		String nameSearch = sc.nextLine();

		boolean str = false;
		for (String customers : customer) {
			if (customers.equalsIgnoreCase(nameSearch)) {
				str = true;
				break;
			}
		}
		if (str) {
			System.out.println(nameSearch + "customer Found");
		} else {
			System.out.println(nameSearch + "customer NotFound");
		}
		sc.close();

	}

}
