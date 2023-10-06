package com.techelevator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StuffedAnimalTest {
    @Test
    public void getProductNameAssertInventory() throws FileNotFoundException {
        //Arrange
        String path = "C:\\Users\\Student\\workspace\\java-minicapstonemodule1-team1\\capstone\\vendingmachine.csv";
        File inventoryFile = new File(path);
        Scanner inventoryInput = new Scanner(inventoryFile);
        Map<String, StuffedAnimal> inventoryMap = new HashMap<String, StuffedAnimal>();

        while(inventoryInput.hasNextLine()){
            String line = inventoryInput.nextLine();
            String[] lineSplit = line.split("\\|");
            BigDecimal convertedPrice = new BigDecimal(lineSplit[2]);

            StuffedAnimal toy = new StuffedAnimal(lineSplit[0], lineSplit[1], convertedPrice, 5, lineSplit[3]);

            inventoryMap.put(toy.getProductCode(), toy);
        }

        //Act
        String testProductName = inventoryMap.get("A2").getProductName();

        //Assert
        Assert.assertEquals("Cube Duck", testProductName);

    }

    @Test
    public void getAnimalMessageAssertInventory() throws FileNotFoundException {
        //Arrange
        String path = "C:\\Users\\Student\\workspace\\java-minicapstonemodule1-team1\\capstone\\vendingmachine.csv";
        File inventoryFile = new File(path);
        Scanner inventoryInput = new Scanner(inventoryFile);
        Map<String, StuffedAnimal> inventoryMap = new HashMap<String, StuffedAnimal>();

        while(inventoryInput.hasNextLine()){
            String line = inventoryInput.nextLine();
            String[] lineSplit = line.split("\\|");
            BigDecimal convertedPrice = new BigDecimal(lineSplit[2]);

            StuffedAnimal toy = new StuffedAnimal(lineSplit[0], lineSplit[1], convertedPrice, 5, lineSplit[3]);

            inventoryMap.put(toy.getProductCode(), toy);
        }

        //Act
        String testProductName = inventoryMap.get("A2").getAnimalMessage();

        //Assert
        Assert.assertEquals("Quack, Quack, Splash!", testProductName);

    }

    

}