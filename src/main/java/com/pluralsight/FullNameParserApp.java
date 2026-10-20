package com.pluralsight;

import java.util.Scanner;

public class FullNameParserApp {
    public static void main(String[] args) {
        //create scanner
        Scanner scanner = new Scanner(System.in);

        //get the users full name
        System.out.println("Please enter your full name: ");
        String fullName = scanner.nextLine().trim();


        System.out.println(fullName);

        //parse the names by space
        String [] nameParts = fullName.split(" ");


        // check if its splited in 3, if so then there is a middle name
        if (nameParts.length == 2) {
            System.out.println("First Name: " + nameParts[0]);
            System.out.println("Middle Name: (None)");
            System.out.println("Last Name: " + nameParts[1]);
        }
        else if (nameParts.length == 3) {
            System.out.println("First Name: " + nameParts[0]);
            System.out.println("Middle Name: " + nameParts[1]);
            System.out.println("Last Name: " + nameParts[2]);
        }
    }
}
