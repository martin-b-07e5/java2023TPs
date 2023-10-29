package org.example.cCaballeroJavaJedi_0k.c02_dolaresAPesos;

import java.util.Scanner;

/* Conversion from dollars to pesos:
 Write a program in Java that prompts the user for a dollar amount and
  display the equivalent in pesos, using a fixed exchange rate.
 For example, if the exchange rate is 1 dollar = 20 pesos,
  and the user enters 50 dollars, the program should display 1000 pesos. */

public class DollarsToPesos {
  public static void main(String[] args) {
    Double tc = 1100D;

    // Create a Scanner object for user input
    Scanner scanner = new Scanner(System.in);

    // Ask the user to enter the real number
    System.out.println("Enter the amount in dollars.");
    Double dollars = scanner.nextDouble();

    // Close the Scanner object
    scanner.close();

    System.out.println("\nDefault");
    System.out.println("U$D " + dollars + " equals to AR$ " + dollars * tc);

    System.out.println("\nFormat and print the result with a specific number of decimal places");
    System.out.println("U$D " + String.format("%.0f", dollars) + " equals to AR$ " + String.format("%.0f", dollars * tc));
    System.out.println("U$D " + String.format("%.1f", dollars) + " equals to AR$ " + String.format("%.1f", dollars * tc));
    System.out.println("U$D " + String.format("%.2f", dollars) + " equals to AR$ " + String.format("%.2f", dollars * tc));
  }

}
