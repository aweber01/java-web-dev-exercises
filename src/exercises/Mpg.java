package exercises;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {
        Scanner inputMiles = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        String miles = inputMiles.nextLine();

        Scanner inputGas = new Scanner(System.in);
        System.out.println("How many gallons of gas have you used? ");
        String gas = inputGas.nextLine();

        double milesPerGallon = Double.parseDouble(miles) / Double.parseDouble(gas);

        System.out.println("Your miles-per-gallon is " + milesPerGallon);
    }
}
