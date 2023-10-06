package com.techelevator;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.File;

public class VendingMachineActions {

    //Initialize Scanner for User Input
    public static Scanner userInput = new Scanner(System.in);

    //Method to display the Main Menu options
    public static void displayMainMenuOptions(Map<String, StuffedAnimal> inventoryMap, BigDecimal balance, File logFile) throws VendingMachineException, InterruptedException {
        //Display main menu options
        System.out.println("(1) Display Vending Machine Items");
        System.out.println("(2) Purchase");
        System.out.println("(3) Exit");
        System.out.println("Type the corresponding number to make your selection: ");

        //Ask user to enter a number for choice
        String mainMenuChoice = userInput.nextLine();

        if (mainMenuChoice.equals("1")) {
            VendingMachineActions.displayVendingMachineItems(inventoryMap, balance, logFile);

        } else if (mainMenuChoice.equals("2")) {
            displayPurchaseMenu(inventoryMap, balance, logFile);

        } else if (mainMenuChoice.equals("3")) {
            System.out.println("Thank you for using this vending machine.");

        } else {
            System.out.println("Ya done goofed. Try again.");
            displayMainMenuOptions(inventoryMap, balance, logFile);
        }
    }

    //Method to output the contents of inventoryMap in order
    public static void displayVendingMachineItems(Map<String,StuffedAnimal> inventoryMap, BigDecimal balance, File logFile) throws VendingMachineException, InterruptedException {
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

//        System.out.println("---");
//        Thread.sleep(1000);

        displayMainMenuOptions(inventoryMap, balance, logFile);
    }

    public static void displayPurchaseMenu(Map<String, StuffedAnimal> inventoryMap, BigDecimal balance, File logFile) {

        System.out.println("---");
        System.out.println("");
        System.out.println("Current Money Provided: $" + balance);
        System.out.println("");
        System.out.println("(1) Feed Money");
        System.out.println("(2) Select Product");
        System.out.println("(3) Finish Transaction");
        System.out.println("");
        System.out.println("---");
        System.out.println("Type the corresponding number to make your selection: ");
        String purchaseMenuChoice = userInput.nextLine();

        if (purchaseMenuChoice.equals("1")) {
            VendingMachineActions.feedMoney(inventoryMap, balance, logFile);

        } else if (purchaseMenuChoice.equals("2")) {
            displayPurchaseList(inventoryMap, balance, logFile);

        } else if (purchaseMenuChoice.equals("3")) {
            calculateChange(balance, logFile);
        } else {
            System.out.println("Oopsie ya made a poopsie.");
            displayPurchaseMenu(inventoryMap, balance, logFile);
        }
    }

    public static void feedMoney(Map<String, StuffedAnimal> inventoryMap, BigDecimal balance, File logFile) {
        Scanner readMoneyInput = new Scanner(System.in);

        System.out.println("Please input the whole dollar amount you wish to deposit or Enter X to return to the previous menu: ");
        System.out.println("Note: this machine only accepts $1, $5, and $10 bills");

        System.out.print("$");
        String moneyInput = readMoneyInput.nextLine();

        if (moneyInput.equalsIgnoreCase("X")) {
            displayPurchaseMenu(inventoryMap, balance, logFile);

        } else if(moneyInput.equals("1") || moneyInput.equals("5") || moneyInput.equals("10")) {

            balance = balance.add(new BigDecimal(moneyInput));

            try (PrintWriter pw = new PrintWriter(new FileOutputStream(logFile, true) )) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                pw.println(dtf.format(now) + " FEED MONEY: $" + moneyInput + ".00 $" + balance + ".00");
            }
            catch(FileNotFoundException ex) {
                System.err.println("I'M AN ERROR"); //System.err.println prints it out in NICE RED LETTERS TO SHOW YOU THAT SOMETHING IS WRONG
            }

        } else {
            System.out.println("You have not deposited a valid bill? So like please try again?");
            feedMoney(inventoryMap, balance, logFile);
        }

        displayPurchaseMenu(inventoryMap, balance, logFile); //update the Purchase Menu display w/ new balance

    }

    public static void displayPurchaseList(Map<String, StuffedAnimal> inventoryMap, BigDecimal balance, File logFile) {
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

        System.out.println("Please enter the product code for the item you wish to purchase: ");
        String productChoice = userInput.nextLine();

        //Check if Product Code exists
        if (inventoryMap.containsKey(productChoice)) {

            StuffedAnimal cheese = inventoryMap.get(productChoice);

            //Check if there is any quantity of item left
            if (cheese.getQuantityInStock() > 0) {

                //Check if user has enough $ to purchase item
                if (balance.compareTo(cheese.getProductPrice()) >= 0) {

                    inventoryMap.get(productChoice).quantityInStock = inventoryMap.get(productChoice).quantityInStock - 1;
                    balance = balance.subtract(cheese.getProductPrice());

                    System.out.println(cheese.getAnimalMessage());
                    //Timer stuff

                    System.out.println("You purchased: " + cheese.getProductName() + " for $" + cheese.getProductPrice() + " and have $" + balance + " remaining.");

                    try (PrintWriter pw = new PrintWriter(new FileOutputStream(logFile, true) )) {
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        pw.println(dtf.format(now) + " " + cheese.getProductName() + " " + cheese.getProductCode() + " $" + cheese.getProductPrice() + " $" + balance);
                    }
                    catch(FileNotFoundException ex) {
                        System.err.println("I'M AN ERROR"); //System.err.println prints it out in NICE RED LETTERS TO SHOW YOU THAT SOMETHING IS WRONG
                    }

                    displayPurchaseMenu(inventoryMap, balance, logFile);

                } else {
                    System.out.println("Insufficient funds. Please make another selection or deposit additional funds: ");
                    displayPurchaseMenu(inventoryMap, balance, logFile);
                }

            } else {
                System.out.println("This item is out of stock! Please make another selection: ");
                displayPurchaseMenu(inventoryMap, balance, logFile);
            }
        } else {
            System.out.println("This is not a valid product code! Please make another selection: ");
            displayPurchaseMenu(inventoryMap, balance, logFile);
        }

    }

    public static void calculateChange(BigDecimal change, File logFile){
        BigDecimal previousBalance = change; //keep the original balance to add to log file later

        BigDecimal quarters = new BigDecimal(0);
        BigDecimal nickels = new BigDecimal(0);
        BigDecimal dimes = new BigDecimal(0);
        String changeStatement = "";

        if(change.remainder(new BigDecimal(.25)).compareTo(BigDecimal.ZERO) == 0 || (change.compareTo(BigDecimal.valueOf(.24))) == 1) {
            change = change.multiply(BigDecimal.valueOf(100));
            BigInteger changeRound = change.toBigInteger();
            BigInteger quartersRound = quarters.toBigInteger();
            quartersRound = (changeRound.divide(BigInteger.valueOf(25)));
            change = new BigDecimal(changeRound).divide(BigDecimal.valueOf(100));
            quarters = new BigDecimal(quartersRound);
            change = change.subtract(quarters.multiply(BigDecimal.valueOf(.25)));
        }

        if(change.remainder(new BigDecimal(.10)).compareTo(BigDecimal.ZERO) == 0 || (change.compareTo(BigDecimal.valueOf(.09))) == 1) {
            change = change.multiply(BigDecimal.valueOf(100));
            BigInteger changeRound = change.toBigInteger();
            BigInteger dimesRound = dimes.toBigInteger();
            dimesRound = (changeRound.divide(BigInteger.valueOf(10)));
            change = new BigDecimal(changeRound).divide(BigDecimal.valueOf(100));
            dimes = new BigDecimal(dimesRound);
            change = change.subtract(dimes.multiply(BigDecimal.valueOf(.10)));
        }

        if (change.remainder(new BigDecimal(.05)).compareTo(BigDecimal.ZERO) == 0 || (change.compareTo(BigDecimal.valueOf(.04))) == 1) {
            change = change.multiply(BigDecimal.valueOf(100));
            BigInteger changeRound = change.toBigInteger();
            BigInteger nickelsRound = nickels.toBigInteger();
            nickelsRound = (changeRound.divide(BigInteger.valueOf(5)));
            change = new BigDecimal(changeRound).divide(BigDecimal.valueOf(100));
            nickels = new BigDecimal(nickelsRound);
            change = change.subtract(nickels.multiply(BigDecimal.valueOf(.05)));
        }

        BigInteger nickelsInt = nickels.toBigInteger();
        BigInteger dimesInt = dimes.toBigInteger();
        BigInteger quartersInt = quarters.toBigInteger();
        changeStatement = "Your change is " + quartersInt + " quarters, " + dimesInt + " dimes, and " + nickelsInt + " nickels!";


        try (PrintWriter pw = new PrintWriter(new FileOutputStream(logFile, true) )) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            //03/01/2023 12:01:35 PM GIVE CHANGE: $6.75 $0.00
            pw.println(dtf.format(now) + " GIVE CHANGE: $" + previousBalance + " $0.00");
        }
        catch(FileNotFoundException ex) {
            System.err.println("I'M AN ERROR"); //System.err.println prints it out in NICE RED LETTERS TO SHOW YOU THAT SOMETHING IS WRONG
        }

        System.out.println(changeStatement);
    }



}
