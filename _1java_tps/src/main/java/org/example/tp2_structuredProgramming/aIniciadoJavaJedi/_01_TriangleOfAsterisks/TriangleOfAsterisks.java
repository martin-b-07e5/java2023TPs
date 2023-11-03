package org.example.tp2_structuredProgramming.aIniciadoJavaJedi._01_TriangleOfAsterisks;

/* Print an asterisk triangle. Use loops(bucles). */

public class TriangleOfAsterisks {
  public static void main(String[] args) {
    int height = 5; // height of the triangle

    System.out.println("------------------------------");
    System.out.println("Basic triangle");
    // iterate over each row
    for (int i = 0; i < height; i++) {
      // Print the number of asterisks corresponding to the current row
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }

      // newline at the end of each row
      System.out.println();
    }

    System.out.println("------------------------------");
    System.out.println("Aligned triangle");
    // iterate over each row
    for (int i = 1; i <= height; i++) {

      // Print spaces to align the asterisks
      for (int j = 1; j <= height - i; j++) {
        System.out.print("·");
      }
      // Print asterisks
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
      }

      // Newline to move to the next row of the triangle
      System.out.println();
    }

    System.out.println("------------------------------");
  }
}
