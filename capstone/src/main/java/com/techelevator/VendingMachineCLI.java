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
	private Map<String, StuffedAnimal> inventoryMap = new HashMap<String, StuffedAnimal>();



	public VendingMachineCLI() throws FileNotFoundException {

	}

	public void run() {
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
		for (Map.Entry<String, StuffedAnimal> thingy : inventoryMap.entrySet()) {
			
			}
		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		VendingMachineCLI cli = new VendingMachineCLI();
		cli.run();
	}
}
