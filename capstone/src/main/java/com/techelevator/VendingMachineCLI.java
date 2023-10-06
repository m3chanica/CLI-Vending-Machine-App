package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;


public class VendingMachineCLI {

	//Declare path for Inventory File
	private String path = "C:\\Users\\Student\\workspace\\java-minicapstonemodule1-team1\\capstone\\vendingmachine.csv";

	//Initialize Inventory File Object
	File inventoryFile = new File(path);

	//Prepare Inventory file for reading
	Scanner inventoryInput = new Scanner(inventoryFile);

	//Initialize Scanner for User Input
	private final Scanner userInput = new Scanner(System.in);

	//Initialize Map to hold inventory objects
	public Map<String, StuffedAnimal> inventoryMap = new HashMap<String, StuffedAnimal>();



	public VendingMachineCLI() throws FileNotFoundException {

	}

	public void run() throws VendingMachineException {
		//While loop to iterate through each line of the inventory list
		while(inventoryInput.hasNextLine()){
			//Split each line into multiple parts, saved into an array
			String line = inventoryInput.nextLine();
			String[] lineSplit = line.split("\\|");
			BigDecimal convertedPrice = new BigDecimal(lineSplit[2]);

			//Create new instance of StuffedAnimal
			StuffedAnimal toy = new StuffedAnimal(lineSplit[0], lineSplit[1], convertedPrice, 5, lineSplit[3]);

			inventoryMap.put(toy.getProductCode(), toy);
		}

		//Main Menu

		//Display main menu options
		System.out.println("(1) Display Vending Machine Items");
		System.out.println("(2) Purchase");
		System.out.println("(3) Exit");
		System.out.println("Type the corresponding number to make your selection: ");


		//Ask user to enter a number for choice
		String mainMenuChoice = userInput.nextLine();

		if (mainMenuChoice.equals("1")) {
			displayVendingMachineItems(inventoryMap);
		}

//		} else if (mainMenuChoice.equals("2")) {
//
//		} else if (mainMenuChoice.equals("3")); {
//
//		} else {
//			throw new VendingMachineException("You did not input a valid selection!");
//		}

	}

	public static void main(String[] args) throws FileNotFoundException, VendingMachineException {
		VendingMachineCLI cli = new VendingMachineCLI();
		cli.run();
	}

	//Method to output the contents of inventoryMap in order
	public void displayVendingMachineItems(Map<String,StuffedAnimal> inventoryMap) {
		System.out.println(inventoryMap.get("A1").getProductCode() + ") " + inventoryMap.get("A1").getProductName() + " $" + inventoryMap.get("A1").getProductPrice() + " Quantity: " + inventoryMap.get("A1").getQuantityInStock());
		System.out.println(inventoryMap.get("A2").getProductCode() + ") " + inventoryMap.get("A2").getProductName() + " $" + inventoryMap.get("A2").getProductPrice() + " Quantity: " + inventoryMap.get("A2").getQuantityInStock());
		System.out.println(inventoryMap.get("A3").getProductCode() + ") " + inventoryMap.get("A3").getProductName() + " $" + inventoryMap.get("A3").getProductPrice() + " Quantity: " + inventoryMap.get("A3").getQuantityInStock());
		System.out.println(inventoryMap.get("A4").getProductCode() + ") " + inventoryMap.get("A4").getProductName() + " $" + inventoryMap.get("A4").getProductPrice() + " Quantity: " + inventoryMap.get("A4").getQuantityInStock());

		System.out.println(inventoryMap.get("B1").getProductCode() + ") " + inventoryMap.get("B1").getProductName() + " $" + inventoryMap.get("B1").getProductPrice() + " Quantity: " + inventoryMap.get("B1").getQuantityInStock());
		System.out.println(inventoryMap.get("B2").getProductCode() + ") " + inventoryMap.get("B2").getProductName() + " $" + inventoryMap.get("B2").getProductPrice() + " Quantity: " + inventoryMap.get("B2").getQuantityInStock());
		System.out.println(inventoryMap.get("B3").getProductCode() + ") " + inventoryMap.get("B3").getProductName() + " $" + inventoryMap.get("B3").getProductPrice() + " Quantity: " + inventoryMap.get("B3").getQuantityInStock());
		System.out.println(inventoryMap.get("B4").getProductCode() + ") " + inventoryMap.get("B4").getProductName() + " $" + inventoryMap.get("B4").getProductPrice() + " Quantity: " + inventoryMap.get("B4").getQuantityInStock());

		System.out.println(inventoryMap.get("C1").getProductCode() + ") " + inventoryMap.get("C1").getProductName() + " $" + inventoryMap.get("C1").getProductPrice() + " Quantity: " + inventoryMap.get("C1").getQuantityInStock());
		System.out.println(inventoryMap.get("C2").getProductCode() + ") " + inventoryMap.get("C2").getProductName() + " $" + inventoryMap.get("C2").getProductPrice() + " Quantity: " + inventoryMap.get("C2").getQuantityInStock());
		System.out.println(inventoryMap.get("C3").getProductCode() + ") " + inventoryMap.get("C3").getProductName() + " $" + inventoryMap.get("C3").getProductPrice() + " Quantity: " + inventoryMap.get("C3").getQuantityInStock());
		System.out.println(inventoryMap.get("C4").getProductCode() + ") " + inventoryMap.get("C4").getProductName() + " $" + inventoryMap.get("C4").getProductPrice() + " Quantity: " + inventoryMap.get("C4").getQuantityInStock());

		System.out.println(inventoryMap.get("D1").getProductCode() + ") " + inventoryMap.get("D1").getProductName() + " $" + inventoryMap.get("D1").getProductPrice() + " Quantity: " + inventoryMap.get("D1").getQuantityInStock());
		System.out.println(inventoryMap.get("D2").getProductCode() + ") " + inventoryMap.get("D2").getProductName() + " $" + inventoryMap.get("D2").getProductPrice() + " Quantity: " + inventoryMap.get("D2").getQuantityInStock());
		System.out.println(inventoryMap.get("D3").getProductCode() + ") " + inventoryMap.get("D3").getProductName() + " $" + inventoryMap.get("D3").getProductPrice() + " Quantity: " + inventoryMap.get("D3").getQuantityInStock());
		System.out.println(inventoryMap.get("D4").getProductCode() + ") " + inventoryMap.get("D4").getProductName() + " $" + inventoryMap.get("D4").getProductPrice() + " Quantity: " + inventoryMap.get("D4").getQuantityInStock());
	}
}
