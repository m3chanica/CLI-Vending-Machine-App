//package com.techelevator;
//
//import java.io.FileNotFoundException;
//import java.math.BigDecimal;
//import java.util.*;
//import java.io.File;
//
//
//public class ChangeCalc extends VendingMachineCLI{
//    //Declare variables
//    BigDecimal balanceDue;
//    BigDecimal moneyIn;
//    BigDecimal change;
//
//    public ChangeCalc() throws FileNotFoundException {
//    }
//
//    balanceDue = balanceDue + ;
//    change = moneyIn - balanceDue;
//
//
//    public String calculateChange(BigDecimal change){
//        int quarters = 0;
//        int nickels = 0;
//        int dimes = 0;
//        String changeStatement = "";
//
//        if(change % .25 == 0 || change > .24){
//            quarters = quarters + change/.25;
//            change = change - quarters * .25;
//            if(change % .10 == 0 || change > .09){
//                dimes = dimes + change/.10;
//                change = change - dimes * .10;
//                if(change % .05 || change > .04){
//                    nickels = nickels + change /.05;
//                    change = change - nickels * .05;
//                }
//            }
//            changeStatement = "Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels!";
//        }
//        else if(change < .25){
//            dimes = dimes + change/.10;
//            change = change - dimes * .10;
//            if(change % .05 || change > .04){
//                nickels = nickels + change /.05;
//                change = change - nickels * .05;
//            }
//
//            changeStatement = "Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels!";
//        }
//        else if(change < .10){
//            if(change % .05 || change > .04){
//                nickels = nickels + change /.05;
//                change = change - nickels * .05;
//            }
//
//            changeStatement = "Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels!";
//        }
//        return changeStatement;
//    }
//}
