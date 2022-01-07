package org.launchcode.java.studios.countingcharacters;

import java.util.Scanner;

import static org.launchcode.java.studios.countingcharacters.InstanceCount.getInstanceCount;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = "";

        System.out.println("What text would you like to analyze?");
        userInput = input.nextLine();

        while (userInput.isEmpty()) {
            System.out.println("Please enter text: ");
            userInput = input.nextLine();
        }
        System.out.println(getInstanceCount(userInput));
    }
}


