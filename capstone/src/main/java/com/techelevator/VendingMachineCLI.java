package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.*;


public class VendingMachineCLI {

	//Declare path for Inventory File
	private String path = "C:\\Users\\Student\\workspace\\java-minicapstonemodule1-team1\\capstone\\vendingmachine.csv";

	//Initialize Inventory File Object
	File inventoryFile = new File(path);

	//Prepare Inventory file for reading
	Scanner inventoryInput = new Scanner(inventoryFile);

	//Initialize Map to hold inventory objects
	public Map<String, StuffedAnimal> inventoryMap = new HashMap<String, StuffedAnimal>();

	//Initialize the balance
	BigDecimal balance = BigDecimal.valueOf(0);

	//Set path for log file
	File logFile = new File("C:\\Users\\Student\\workspace\\java-minicapstonemodule1-team1\\capstone", "log.txt");

	//Initialize log.txt file for recording $ transactions
	PrintWriter dataOutput = new PrintWriter(logFile);

	public VendingMachineCLI() throws FileNotFoundException {

	}

	public void run() throws VendingMachineException, InterruptedException, IOException {
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

		//Create the log file
		logFile.createNewFile();

		//Display Main Menu
		VendingMachineActions.displayMainMenuOptions(inventoryMap, balance, logFile);
	}

	public static void main(String[] args) throws IOException, VendingMachineException, InterruptedException {
		VendingMachineCLI cli = new VendingMachineCLI();
		cli.run();
	}

}
