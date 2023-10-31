package org.example.tp1_0k.cCaballeroJavaJedi_0k.c06BitcoinsToDollars;

/* 6. Conversión de bitcoins a dólares:
Escribir un programa en Java que solicite al usuario una cantidad en bitcoins y muestre el equivalente en dólares, utilizando una
tasa de cambio fija.

Por ejemplo, si la tasa de cambio es de 1 bitcoin = 50000 dólares, y
el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares.*/

import java.util.Scanner;

public class BitcoinToDollar {

  public static void main(String[] args) {
    double tc = 50000D;

    try (Scanner sc = new Scanner(System.in)) {
      // unicode: sterling
      System.out.println("Enter the amount in Bitcoins");
      double bitcoins = sc.nextDouble();

      System.out.println(String.format("%.1f", bitcoins) + " Bitcoin equals to U$D " + String.format("%.0f",
          bitcoins * tc));

      System.out.println("\nThanks for using my program");

    } catch (Exception e) {
      System.out.println("error: " + e);
    }

  }

}
