package org.example.tp1_0k.dMaestroJavaJedi_0k.d06FinalVelocity;

/* Calculate the final velocity of an object in free fall,
 given its initial velocity, the acceleration of gravity and the elapsed time.
Use the formula: v_f = v_i + g * t
Where
 v_f is the final velocity,
 v_i is the initial velocity,
 g is the acceleration of gravity and
 t is the elapsed time. */

import java.util.Scanner;

public class FreeFall {

  public static void main(String[] args) {

    double inicialVelocity, elapsedTime, finalVelocity;
    // Constante para la aceleración debido a la gravedad (m/s^2)
    final double GRAVITY = 9.81;

    try (Scanner scanner = new Scanner(System.in)) {

      System.out.println("Enter the initial velocity (in meters per second): ");
      inicialVelocity = scanner.nextDouble();

      System.out.println("Enter the elapsed time (in seconds): ");
      elapsedTime = scanner.nextDouble();

      // Calculate the final velocity using the formula
      finalVelocity = inicialVelocity + GRAVITY * elapsedTime;

      // Display the result
      System.out.println("The final velocity of the object in free fall is: " + finalVelocity + " meters per second");
    } catch (java.util.InputMismatchException e) {
      System.err.println("Input error: Please enter valid numeric values.");
    }
  }

}
