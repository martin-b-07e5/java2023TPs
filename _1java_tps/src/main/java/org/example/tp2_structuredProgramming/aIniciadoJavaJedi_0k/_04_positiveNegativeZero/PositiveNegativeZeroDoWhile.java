package org.example.tp2_structuredProgramming.aIniciadoJavaJedi_0k._04_positiveNegativeZero;

import java.util.Scanner;

public class PositiveNegativeZeroDoWhile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char input = 'c'; // Initialize input with 'c'

    do {
      double number;

      System.out.print("Enter a number: ");
      if (scanner.hasNextDouble()) {
        number = scanner.nextDouble();
      } else {
        System.out.println("Invalid input. Please enter a number");
        scanner.nextLine(); // Consume the invalid input
        continue;
      }

      System.out.println("\nUsing if-else");
      if (number > 0) {
        System.out.println("The number is positive");
      } else if (number < 0) {
        System.out.println("The number is negative");
      } else {
        System.out.println("The number is zero");
      }

      System.out.println("\nUsing ternary operator");
      String result = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
      System.out.println("The number is " + result + ".");

      boolean validInput = false;
      while (!validInput) {
        System.out.print("Press 'c' to continue or 'q' to quit: ");
        try {
          // input = scanner.next().charAt(0);  // Read the first character of the input
          input = Character.toLowerCase(scanner.next().charAt(0));
          validInput = (input == 'c' || input == 'q');

        } catch (Exception e) {
          System.out.println("Invalid input, please enter 'c' or 'q'");
        }
      }
    } while (input == 'c');

    scanner.close();

    if (input == 'q') {
      System.out.println("Thanks for using my program.");
    }
  }

}
