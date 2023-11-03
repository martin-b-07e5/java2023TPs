package org.example.tp2_structuredProgramming.aIniciadoJavaJedi_0k._05_sumOfNaturalNumbers;

/* Calculate the sum of the first N natural numbers, where N is an integer */

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNaturalNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char input = 'c'; // Initialize input to 'c' to enter the loop

    while (input == 'c') {
      int number;

      System.out.print("Enter a positive integer, otherwise it'll be converted to positive: ");
      try {
        number = Math.abs(scanner.nextInt());
      } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number");
        scanner.nextLine(); // Consume the invalid input to clear it from the buffer
        continue; // Skip the rest of the current loop iteration and proceed to the next iteration
      }

      // Calculate the sum here
      int sum = 0;
      for (int i = 1; i <= number; i++) {
        sum += i;
      }
      System.out.println("The sum of the first " + number + " natural numbers is: " + sum);

      // Question to continue or quit, after calculating the sum.
      boolean validInput = false;
      while (!validInput) {
        System.out.print("Press 'c' to continue or 'q' to quit: ");
        try {
          input = Character.toLowerCase(scanner.next().charAt(0));  // Read the first character of the input
          validInput = (input == 'c' || input == 'q'); // if c or q » true
        } catch (Exception e) {
          System.out.println("Invalid input, please enter 'c' or 'q'");
        }
      }
    }

    scanner.close();
  }

}
