package org.example.cCaballeroJavaJedi.c04poundsToDollars;

/* Conversión de libras esterlinas a dólares:
    solicite al usuario una cantidad en libras esterlinas y muestre el equivalente en
    dólares, utilizando una tasa de cambio fija.
Por ejemplo, si la tasa de cambio es de 1 libra esterlina = 1.40 dólares, y
 el usuario ingresa 50 libras esterlinas,
 el programa deberá mostrar 70 dólares. */

import java.util.Scanner;

public class PoundsToDollars {

  public static void main(String[] args) {
    double tc = 1.4D;

    try (Scanner sc = new Scanner(System.in)) {
      // unicode: sterling
      System.out.println("Enter the amount in £");
      double pounds = sc.nextDouble();
      System.out.println("£" + String.format("%.1f", pounds) + " equals to U$D " + String.format("%.0f", pounds * tc));
    } catch (Exception e) {
      System.out.println("error: " + e);
    } finally {
      System.out.println("\nThanks for using my program");
    }

  }

}
