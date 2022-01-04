package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String origSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or " +
                "conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";

        String firstSentence = origSentence.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to search: ");
        String searchTerm = input.nextLine().toLowerCase();

        boolean result = firstSentence.contains(searchTerm);

        int index = firstSentence.indexOf(searchTerm);
        int length = searchTerm.length();

        System.out.println("The sentence contains your search parameter: " + result + ". Your search is " + length +
                " characters long.");
    }
}
