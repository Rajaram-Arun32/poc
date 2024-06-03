package com.poc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GreenDartShipment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Cargo's");
		int n = sc.nextInt();
		sc.nextLine();
		// To Read the cargo IDs
		System.out.println("Enter the cargo id");
		int[] cargoid = new int[n];
		for (int i = 0; i < n; i++) {
			cargoid[i] = sc.nextInt();
		}
		sc.nextLine();
		System.out.println("Eter the number of shipment");
		int noOfshipments = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the shipment names");
		String shipmentNames[] = new String[noOfshipments];
		for (int i = 0; i < noOfshipments; i++) {
			shipmentNames[i] = sc.nextLine();
		}
		System.out.println("Enter the cargo id to search");
		int cargoIdToSearch = sc.nextInt();
		// Create a map to associate cargo IDs with shipment names
		Map<Integer, String> cargoShipment = new HashMap<>();
		for (int i = 0; i < noOfshipments; i++) {
			cargoShipment.put(cargoid[i], shipmentNames[i]);
		}
		// Check if the cargo ID has a corresponding shipment
		if (cargoShipment.containsKey(cargoIdToSearch)) {
			System.out.println(cargoShipment.get(cargoIdToSearch));
		} else {
			System.out.println("Yet to be shipped");
		}
		sc.close();
	}

}
