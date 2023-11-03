package org.example.tp2_structuredProgramming.aIniciadoJavaJedi._04_positiveNegativeZero;

/* Store a number and determine whether it is positive, negative or zero. */

import java.util.Scanner;

public class PositiveNegativeZero {

  public static void main(String[] args) {
    double number;
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      number = scanner.nextDouble();

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
    }
  }

}
