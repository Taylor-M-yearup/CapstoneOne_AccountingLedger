package com.ps;

import javax.swing.text.DateFormatter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    static Scanner commandScanner = new Scanner(System.in);
    static Scanner inputScanner = new Scanner(System.in);
    static ArrayList<Transaction> transaction = new ArrayList<Transaction>();



    public static void main(String[] args) {
        loadTransactionFromFile();

        //initialize the command variable (int mainMenuCommand;)
        int mainMenuCommand;

        do{
            // Display the menu
             System.out.println("Please enter an options: ");
             System.out.println("1) Add Deposit ");
             System.out.println("2) Make Payment(Debit) ");
             System.out.println("3) Display The Ledger");
             System.out.println("0) Exit");
             System.out.print("Command: ");

             try{
                 mainMenuCommand = commandScanner.nextInt();
             } catch (InputMismatchException ime) {
                  ime.printStackTrace();
                  mainMenuCommand = 0;
             }
             switch (mainMenuCommand){
                 case 1:
                     // create static methods that match the corresponding command
                     Add Deposit();
                     break;
                 case 2:
                     // Create code for each static method
                     Make Payment(Debit);
                     break;
                 case 3:
                     Display The Ledger();
                     break;
                 case 0:
                  System.out.println("Exiting");
                  break;
                 default:
                     //Handle incorrect commands
                     System.out.println("Command not found, please try again");

             }


    }

}


    }

