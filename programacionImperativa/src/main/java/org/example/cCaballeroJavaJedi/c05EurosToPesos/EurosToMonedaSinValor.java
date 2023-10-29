package org.example.cCaballeroJavaJedi.c05EurosToPesos;

import java.util.Scanner;

/* Prompt the user for an amount in euros and display the equivalent in pesos,
 using a fixed exchange rate. */

public class EurosToMonedaSinValor {

  public static void main(String[] args) {
    Double tc = 1043.56D;

    // it's not necessary to close
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the amount in €");
      Double euros = sc.nextDouble();

      System.out.println("\nFormat and print the result with a specific number of decimal places");
      System.out.println("€ " + String.format("%.0f", euros) + " equals to $AR " + String.format("%.0f", euros * tc));
      System.out.println("€ " + String.format("%.1f", euros) + " equals to $AR " + String.format("%.1f", euros * tc));
      System.out.println("€ " + String.format("%.2f", euros) + " equals to $AR " + String.format("%.2f", euros * tc));
    } catch (Exception e) {
      System.out.println("error: " + e);
    } finally {
      System.out.println("\nThanks for using my program");
    }

  }

}
