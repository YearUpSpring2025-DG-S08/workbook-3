package com.pluralsight;
import java.io.FileInputStream;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // prompt user for name of story and file to read
        System.out.println("Welcome to our childhood library!");
        System.out.println("""
                Please choose one of our available stories:\s
                [1] Hansel and Gretel\s
                [2] Goldilocks\s
                [3] Mary Had a Little Lamb\s
                """);

        int choice = 0;
        if(scanner.hasNextInt()){
            choice = scanner.nextInt();
        } else{
            scanner.next();
        }

        // use new Scanner to load and read each line of file
        String bookChoice;
        int lineNumber = 1;
        try {
            switch (choice){
                case 1:
                    FileInputStream hansAndGretel = new FileInputStream("hansel_and_gretel.txt");
                    Scanner fileReader = new Scanner(hansAndGretel);
                    while(fileReader.hasNextLine()){
                        bookChoice = fileReader.nextLine();
                        System.out.println(lineNumber + "  " + bookChoice);
                        lineNumber++;
                    }
                    break;
                case 2:
                    FileInputStream goldilocks = new FileInputStream("goldilocks.txt");
                    Scanner fileReader2 = new Scanner(goldilocks);
                    while(fileReader2.hasNextLine()){
                        bookChoice = fileReader2.nextLine();
                        System.out.println(lineNumber + "  " + bookChoice);
                        lineNumber++;
                    }
                    break;
                case 3:
                    FileInputStream maryLittleLamb = new FileInputStream("mary_had_a_little_lamb.txt");
                    Scanner fileReader3 = new Scanner(maryLittleLamb);
                    while(fileReader3.hasNextLine()){
                        bookChoice = fileReader3.nextLine();
                        System.out.println(lineNumber + "  " + bookChoice);
                        lineNumber++;
                    }
                    break;
                default:
                    System.out.println("Invalid Input. Please try again!");
            }


            scanner.close();
        } catch (Exception e) {
            System.out.println("Invalid entry!");
        }

        // print file to screen, but add line numbers to the beginning of each line



    }
}