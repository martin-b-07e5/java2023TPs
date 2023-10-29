package org.example.cCaballeroJavaJedi.c03_eurosToDollars;

import java.util.Scanner;

/* Prompt the user for an amount in euros and display the equivalent in dollars,
 using a fixed exchange rate. */
public class EuroToDollar {

  public static void main(String[] args) {
    // https://www.forbes.com/advisor/money-transfer/currency-converter/eur-usd/
    Double tc = 1.05702658D;

    // Create a Scanner object for user input
    try (Scanner sc = new Scanner(System.in)) {
      // ask for the qy in €
      System.out.println("Enter the amount in €");
      Double euros = sc.nextDouble();
      // sc.close();  // redundant close()

      System.out.println("\nFormat and print the result with a specific number of decimal places");
      System.out.println("€ " + String.format("%.0f", euros) + " equals to U$D " + String.format("%.0f", euros * tc));
      System.out.println("€ " + String.format("%.1f", euros) + " equals to U$D " + String.format("%.1f", euros * tc));
      System.out.println("€ " + String.format("%.2f", euros) + " equals to U$D " + String.format("%.2f", euros * tc));
      System.out.println("€ " + String.format("%.5f", euros) + " equals to U$D " + String.format("%.5f", euros * tc));
    } catch (Exception e) {
      System.out.println("error: " + e);
    } finally {
      System.out.println("\nThanks for using my program");
    }
  }

}
