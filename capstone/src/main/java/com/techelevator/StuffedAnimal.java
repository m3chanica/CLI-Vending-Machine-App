package com.techelevator;

public class StuffedAnimal extends VendingMachineItem{

    //Declare properties
    private String animalType; //Ex. Duck, Cat, Pony
    private String animalMessage; //Ex. Quack, Meow

    //Getters and Setters
    public String getAnimalType() {
        return this.animalType;
    }
    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    //Getter but no Setter for derived property, animalMessage, that is based on animalType
    public String getAnimalMessage() {

        //Assign an animal message based on the animal type
        if (animalType.equals("Duck")) {
            animalMessage = "Quack, Quack, Splash!";

        } else if (animalType.equals("Penguin")) {
            animalMessage = "Squawk, Squawk, Whee!";

        } else if (animalType.equals("Cat")) {
            animalMessage = "Meow, Meow, Meow!";

        } else if (animalType.equals("Pony")) {
            animalMessage = "Neigh, Neigh, Yay!";
        }

        return this.animalMessage;
    }

    //Constructors
    public StuffedAnimal() {}

    public StuffedAnimal(String animalType) {
        this.animalType = animalType;
        this.animalMessage = getAnimalMessage();
    }


}
