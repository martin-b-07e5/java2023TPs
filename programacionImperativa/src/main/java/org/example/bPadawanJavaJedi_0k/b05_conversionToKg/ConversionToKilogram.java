package org.example.bPadawanJavaJedi_0k.b05_conversionToKg;

import java.text.DecimalFormat;

/* Conversion to kilograms:
  Store in one memory space your pounds and then, in another memory space
   perform the conversion from those pounds to kilograms.

  Use a constant of the values that will not change in this conversion.
 */
public class ConversionToKilogram {
  public static void main(String[] args) {

    // Define a constant for the conversion
    final double POUNDS_TO_KILOGRAMS = 0.45359237;

    // Store pounds in a variable
    int myPounds = 10;

    // Perform the conversion and store the result in another variable
    double myKilograms = myPounds * POUNDS_TO_KILOGRAMS;

    System.out.println(myPounds + " pounds ~ " + myKilograms + " kg");

    // Format and print the result with a specific number of decimal places
    System.out.println("----------");
    System.out.println("ahora usando String.format");
    System.out.println(myPounds + " pounds ~ " + String.format("%.2f", myKilograms) + " kg");
    System.out.println(myPounds + " pounds ~ " + String.format("%.3f", myKilograms) + " kg");
    System.out.println(myPounds + " pounds ~ " + String.format("%.4f", myKilograms) + " kg");

    System.out.println("----------");
    System.out.println("ahora usando DecimalFormat");

    // Create a DecimalFormat with 2 decimal places
    DecimalFormat df = new DecimalFormat("#.##");

    // Format and print the result using DecimalFormat
    System.out.println(myPounds + " pounds ~ " + df.format(myKilograms) + " kg");
    System.out.println("----------");
  }
}
