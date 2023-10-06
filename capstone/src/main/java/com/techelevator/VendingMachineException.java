package com.techelevator;

public class VendingMachineException extends Exception{
    public VendingMachineException() {
        super();
    }

    public VendingMachineException(String message) {
        super(message);
    }

    public VendingMachineException(String message, Exception cause) {
        super(message, cause);
    }
}
