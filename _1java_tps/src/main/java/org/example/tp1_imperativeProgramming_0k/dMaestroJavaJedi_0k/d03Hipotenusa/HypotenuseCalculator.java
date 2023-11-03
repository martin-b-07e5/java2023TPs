package org.example.tp1_imperativeProgramming_0k.dMaestroJavaJedi_0k.d03Hipotenusa;

/* Calculate the hypotenuse of a right triangle (triángulo rectángulo), given the values of the legs(catetos).
   Use the formula of the Pythagorean theorem: h^2 = a^2 + b^2, where h is the hypotenuse, and a and b are the legs. */

import java.util.Scanner;

public class HypotenuseCalculator {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      // Ask the user to enter the length of the legs
      System.out.print("Enter the length of the first leg (a): ");
      double legA = scanner.nextDouble();

      System.out.print("Enter the length of the second leg (b): ");
      double legB = scanner.nextDouble();

      // Calculate the hypotenuse using the Pythagorean theorem
      double hypotenuse = Math.sqrt(legA * legA + legB * legB);
      double hypotenuse2 = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));

      // Display the result
      System.out.println("The hypotenuse is: " + hypotenuse);
      System.out.println("The hypotenuse is: " + hypotenuse2);
    } catch (Exception e) {
      System.err.println("An error occurred: " + e.getMessage());
    }
  }

}
