package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String firstName = "Majnun";
        String lastName = "Abdurahmanov";
        String phoneNumber = "+994567889";
        String accountNumber = IDGenerator.generateAccountNumber();
        Account account = new Account(accountNumber, firstName, lastName, phoneNumber);

        AccountStorage.saveAccount(account);

        AccountStorage.getAccount(accountNumber);
    }
}

