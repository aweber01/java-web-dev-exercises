package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        String hiddenFig = "If the product of two terms is zero then common sense says at least one of the two " +
                "terms has to be zero to start with. So if you move all the terms over to one side, you can put " +
                "the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        Scanner input = new Scanner(System.in);
        char[] charactersInString = hiddenFig.toLowerCase().toCharArray();

        HashMap<Character, Integer> instances = new HashMap<>();

            for(char c : charactersInString) {
                if(Character.isLetter(c)) {
                    if (!instances.containsKey(c)) {
                        instances.put(c, 1);
                        //char key = charactersInString.indexOf(i);
                    } else {
                        int count = instances.get(c);
                        count++;
                        instances.replace(c, count);
                    }
                }
            }
            System.out.println(instances);
    }
}


