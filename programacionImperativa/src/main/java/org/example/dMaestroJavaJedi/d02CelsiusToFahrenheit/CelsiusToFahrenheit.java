package org.example.dMaestroJavaJedi.d02CelsiusToFahrenheit;

/* 2. convierta una temperatura en grados Celsius a grados Fahrenheit.
  °F = (°C x 1.8) + 32
  https://www.wikihow.com/Convert-Celsius-(%C2%B0C)-to-Fahrenheit-(%C2%B0F)
* */

import java.util.Scanner;

public class CelsiusToFahrenheit {

  public static void main(String[] args) {

    // it's not necessary to close
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the temperature in Celsius");
      Double celsius = sc.nextDouble();

      double fahrenheit = (celsius * 1.8) + 32;

      System.out.println("\nFormat and print the result with a specific number of decimal places");

      System.out.println(String.format("%.1f", celsius) + "º celsius equal to " + String.format("%.2f", fahrenheit) +
          "º " +
          "fahrenheit");

      System.out.println("\nThanks for using my program");

    } catch (Exception e) {
      System.out.println("error: " + e.toString());
    }

  }

}
