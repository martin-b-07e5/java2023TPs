package org.example.tp1_imperativeProgramming_0k.dMaestroJavaJedi_0k.d04MediaAritmetica;

/* Calculate the arithmetic mean of a set of numbers.
 Use the formula: mean = (n1 + n2 + ... + nk) / k
 where
  n1, n2, ..., nk are the numbers and
  k is the total number of elements.
 Use variables and constants as appropriate. Display the result on the screen. */


import java.util.Scanner;

public class ArithmeticMean {

  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {

      // Ask the user for the total number of elements (k)
      System.out.println("Enter the total number of elements (k): ");
      int k = scanner.nextInt();

//      double sum = 0.0;
      double sum = 0D;

      // Ask the user to enter each number and calculate the sum
      for (int i = 1; i <= k; i++) {
        System.out.println("Enter number " + i + ": ");
        double number = scanner.nextDouble();
        sum += number;
      }

      // Calculate the arithmetic mean (mean)
      double mean = sum / k;

      // Display the result
      System.out.println("The arithmetic mean is: " + String.format("%.2f", mean));

      // scanner.close(); // Redundant 'cose()'
    } catch (java.util.InputMismatchException e) {
      System.err.println("Input error: Please enter a valid number.");
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic error: Division by zero is not allowed");
    } catch (Exception e) {
      System.out.println("general error: " + e);
    }

  }

}
