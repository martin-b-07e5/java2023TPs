package org.example.tp2_structuredProgramming.aIniciadoJavaJedi_0k._06_printEvenNumbers;

/* Print only the N even numbers, where the N numbers are stored in variables or constants as appropriate. */

public class PrintEvenNumbers {

  public static void main(String[] args) {
    // Define and store the numbers in individual variables
    int num1 = 2;
    int num2 = 3;
    int num3 = 4;
    int num4 = 5;

    System.out.println("Even numbers among the given values:");

    // Check and display if each number is even
    if (num1 % 2 == 0)
      System.out.println(num1);

    if (num2 % 2 == 0) System.out.println(num2);
    if (num3 % 2 == 0) System.out.println(num3);
    if (num4 % 2 == 0) System.out.println(num3);
  }

}