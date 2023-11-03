package org.example.tp1_imperativeProgramming_0k.cCaballeroJavaJedi_0k.c01_porcentaje;

import java.util.Scanner;

/* 1.Obtener porcentaje :
 "Given two numbers, one being a real number and the other an integer, determine the percentage represented by the second number of the first number."
*/
public class Porcentaje {

  public static void main(String[] args) {
    // Create a Scanner object for user input
    Scanner scanner = new Scanner(System.in);

    // Ask the user to enter the real number
    System.out.println("Ingrese el nro real");
    double realNumber = scanner.nextDouble();

    // Ask the user to enter the integer number
    System.out.println("Ingrese el nro entero");
    int intNumber = scanner.nextInt();

    // Calculate the percentage
    double percentage = (intNumber / 100D) * realNumber; // add the "D" at the end.

    // another way
    /* By adding .0 to 100, you are converting 100 to a floating-point number, which ensures that the division is
    performed as a floating-point operation and the result includes decimals. */
    double percentage1 = (intNumber / 100.0) * realNumber;

    // another way
    double percentage2 = intNumber * realNumber / 100;  // 0k also

    // Display the result
    System.out.println(intNumber + "% of " + realNumber + " is equal to " + percentage);
    System.out.println(intNumber + "% of " + realNumber + " is equal to " + percentage1);
    System.out.println(intNumber + "% of " + realNumber + " is equal to " + percentage2);

    // Close the Scanner object
    scanner.close();
  }

}
