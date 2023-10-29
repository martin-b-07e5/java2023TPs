package org.example.dMaestroJavaJedi.d03Hipotenusa;

/* Calculate the hypotenuse of a right triangle (triángulo rectángulo), given the values of the legs(catetos).
   Use the Pythagorean theorem formula: h^2 = a^2 + b^2, where h is the hypotenuse, and a and b
   are the legs. */

import java.util.Scanner;

public class HypotenuseCalculatorWhile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input;

    // Ask the user to press 'c' to continue or 'q' to quit
    System.out.print("Press 'c' to continue or 'q' to quit: ");
    input = scanner.nextLine();

    while (!input.equals("q")) {
      if (input.equals("c")) {
        try {
          // Ask the user to enter the length of the first leg (a)
          System.out.print("Enter the length of the first leg (a): ");
          double legA = scanner.nextDouble();

          // Ask the user to enter the length of the second leg (b)
          System.out.print("Enter the length of the second leg (b): ");
          double legB = scanner.nextDouble();

          // Calculate the hypotenuse using the Pythagorean theorem
          double hypotenuse = Math.sqrt(legA * legA + legB * legB);

          // Display the result
          System.out.println("The hypotenuse is: " + hypotenuse);
        } catch (Exception e) {
          System.err.println("An error occurred: " + e.getMessage());
        } finally {
          // Clear the input buffer
          scanner.nextLine();

          // Ask the user to press 'c' to continue or 'q' to quit
          System.out.print("Press 'c' to continue or 'q' to quit: ");
          input = scanner.nextLine();
        }
      } else {
        // Ask the user to press 'c' to continue or 'q' to quit
        System.out.print("Press 'c' to continue or 'q' to quit: ");
        input = scanner.nextLine();
      }
    }

    // Close the Scanner
    scanner.close();
  }
}
