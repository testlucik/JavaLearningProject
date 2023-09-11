package com.tekwillacademy;

public class Main {
    public static void main(String[] args) {

        //Declare boolean variables:

        boolean isSuccessful;
        boolean isDomestic;

        //Declare chars:
        char priority;

        // Declare numbers:

        byte currencyId;
        short insitutionId;
        int userID;
        long paymentId;
        float fees;
        double amount;

        // Initiate a payment:

        isSuccessful = true;
        isDomestic = true;
        priority = 'A';
        currencyId = 1;
        insitutionId = 10;
        userID = 102;
        paymentId = 001115566L;
        fees = 3.24F;
        amount = 948.25;

        System.out.println("The initiated payment has " + paymentId + " id and " + amount + " amount.");


    }

}