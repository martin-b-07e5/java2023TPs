package org.example.dMaestroJavaJedi.d05KineticEnergy;

/* Calculate the kinetic energy of an object in motion, given its mass and velocity.
Use the formula: E = (1/2) * m * v^2
Where
 E is the kinetic energy,
 m is the mass of the object and
 v is the velocity.
*/

import java.util.Scanner;

public class KineticEnergy {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the mass of the object (in kg): ");
    double mass = scanner.nextDouble();

    System.out.println("Enter the velocity of the object (in m/s)");
    double velocity = scanner.nextDouble();

    // Calculate the kinetic energy using the formula
    double kineticEnergy = 0.5 * mass * velocity * velocity;

    // Display the result
    System.out.println("The kinetic energy of the object is: " + String.format("%.0f", kineticEnergy) + " joules");


  }

}
