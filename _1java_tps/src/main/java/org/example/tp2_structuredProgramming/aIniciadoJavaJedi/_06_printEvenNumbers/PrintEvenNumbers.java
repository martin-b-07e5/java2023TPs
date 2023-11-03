package org.example.tp2_structuredProgramming.aIniciadoJavaJedi._06_printEvenNumbers;

/* Print only the N even numbers, where the N numbers are stored in variables or constants as appropriate. */

import java.util.Scanner;

public class PrintEvenNumbers {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a positive integer: ");
    int number = scanner.nextInt();

    if (number < 0) {
      System.out.println("The number should be a positive integer");
    }

    System.out.println("----------------");
    for (int i = 2, count = 0; count < number; i += 2, count++) {
      System.out.println(i);
    }
    System.out.println("----------------");
    for (int i = 2; number > 0; i += 2) {
      System.out.println(i);
      number--;
    }
    System.out.println("----------------");

  }

}