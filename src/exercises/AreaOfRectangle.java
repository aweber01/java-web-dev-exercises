package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner inputL = new Scanner(System.in);
        System.out.println("What is the length of the rectangle? ");
        String length = inputL.nextLine();

        Scanner inputW = new Scanner(System.in);
        System.out.println("What is the width of the rectangle? ");
        String width = inputW.nextLine();

        double area = Double.parseDouble(length)* Double.parseDouble(width);

        System.out.println("The area of the rectangle is " + area);
    }
}
