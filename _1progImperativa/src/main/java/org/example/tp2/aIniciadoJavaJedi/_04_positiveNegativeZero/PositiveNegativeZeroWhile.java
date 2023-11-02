package org.example.tp2.aIniciadoJavaJedi._04_positiveNegativeZero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PositiveNegativeZeroWhile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char input = 'c'; // Initialize input to 'c' to enter the loop
    while (input == 'c') {
      double number;

      System.out.print("Enter a number: ");
      try {
        number = scanner.nextDouble();
      } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number");
        scanner.nextLine(); // consume the invalid input (To clear this invalid input from the buffer)
        continue; // is used to skip the rest of the current loop iteration and proceed to the next iteration.
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
          input = scanner.next().charAt(0);  // Read the first character of the input
          validInput = (input == 'c' || input == 'q'); // if c or q » true

        } catch (Exception e) {
          System.out.println("Invalid input, please enter 'c' or 'q'");
        }
      }

    }

    scanner.close();

    if (input == 'q') {
      System.out.println("Thanks for using my program.");
    }
  }

}
