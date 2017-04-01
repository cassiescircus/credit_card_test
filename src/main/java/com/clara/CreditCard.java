package com.clara;

import java.util.Scanner;

/**
 * Created by we4954cp on 8/31/2016.
 */
public class CreditCard {

    static Scanner stringScanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Ask user for credit card number. store number as a String.
        System.out.println("Please enter the credit card number, digits only:");
        String ccNumber = stringScanner.nextLine();
        boolean isValid = isVisaCreditCardNumberValid(ccNumber);

        if (isValid) {
            System.out.println("This seems to be a valid credit card number");
        } else {
            System.out.println("This is **not** a valid credit card number.");
        }

        stringScanner.close();
    }

    public static boolean isVisaCreditCardNumberValid(String cardNumber) {

        //tests to make sure card is a Visa
        if (cardNumber.startsWith("4")) {
            return true;
        } else {
            System.out.println("Your Visa must start with a 4.");
        }

        if (cardNumber.length() != 16) {
            System.out.println("Your Visa must be 16 digits long.");
            return false;
        }

        // TODO check digit - NOt really understanding how to do the math for this...

    }




}
