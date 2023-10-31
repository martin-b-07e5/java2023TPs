package org.example.dMaestroJavaJedi.d07CentripetalForce;

/* Calculate the centripetal force(Fuerza centripeta) required to keep an object on a circular path,
 given its mass, angular velocity and the radius of the path.
Use the formula: F_c = m * v^2 / r
Where
 F_c is the centripetal force,
  m is the mass of the object,
  v is the angular velocity and
  r is the radius of the trajectory.
*/

import java.util.Scanner;

public class CentripetalForce {

  public static void main(String[] args) {
    double mass, angularVelocity, radiusOfTheTrajectory, centripetalForce;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the mass of the object (in kilograms): ");
    mass = scanner.nextDouble();

    System.out.print("Enter the angular velocity (in radians per second): ");
    angularVelocity = scanner.nextDouble();

    System.out.print("Enter the radius of the circular path (in meters): ");
    radiusOfTheTrajectory = scanner.nextDouble();

    scanner.close();

    // Calculate the centripetal force
    centripetalForce = mass * Math.pow(angularVelocity, 2) / radiusOfTheTrajectory;

    // Display the result
    System.out.println("The centripetal force required required to keep an object on a circular path is: " + centripetalForce + " newtons");
  }

}
