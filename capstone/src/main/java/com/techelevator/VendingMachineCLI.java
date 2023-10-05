package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
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
	private Map<String, VendingMachineItem> inventoryMap = new HashMap<String, VendingMachineItem>();



	public VendingMachineCLI() throws FileNotFoundException {

	}

	public void run() {
		//While loop to iterate through each line of the inventory list
		while(inventoryInput.hasNextLine()){
			//Parse out the
			String line = inventoryInput.nextLine();
			String[] lineSplit = line.split("\\|");

			for (int i=0; i < aray length ; i++)
				Stuffed i = lineSplit
			String objectName = lineSplit[1];
			StuffedAnimal (lineSplit[1].toString()) =


		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		VendingMachineCLI cli = new VendingMachineCLI();
		cli.run();
	}
}
