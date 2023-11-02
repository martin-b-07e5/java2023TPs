package org.example.tp2.aIniciadoJavaJedi._03_paridad;

/* Store a number and determine if it is odd or even. */

import java.util.Scanner;

public class Parity {

  public static void main(String[] args) {
    int number;
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      number = scanner.nextInt();

      System.out.println("\nUsing if-else");
      if (number % 2 == 0) {
        System.out.println(number + " is an even number.");
      } else {
        System.out.println(number + " is an odd number.");
      }


      System.out.println("\nUsing the conditional (ternary) operator");
      String result = (number % 2 == 0) ? "even" : "odd";

      System.out.println(number + " is an " + result + " number.");
    }
  }

}
