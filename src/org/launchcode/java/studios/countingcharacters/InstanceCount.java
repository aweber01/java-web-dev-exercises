package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;

public class InstanceCount {
    public static HashMap getInstanceCount(String userInput) {

        char[] charactersInString = userInput.toLowerCase().toCharArray();
        HashMap<Character, Integer> instances = new HashMap<>();

        for (char c : charactersInString) {
            if (Character.isLetter(c)) {
                if (!instances.containsKey(c)) {
                    instances.put(c, 1);
                } else {
                    int count = instances.get(c);
                    count++;
                    instances.replace(c, count);
                }
            }
        }
        return instances;
    }
}
