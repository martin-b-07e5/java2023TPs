package org.example.tp2_structuredProgramming.aIniciadoJavaJedi._02_misAmigos;

/* Save the name of N number of friends in variables, iterate over
that amount showing the name of each friend. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Friends {

  public static void main(String[] args) {
    // Create an array to store friend names
    String[] friends;

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter the number of friends: ");
      int numFriends = scanner.nextInt();

      // array to store friend names
      friends = new String[numFriends];

      // Iterate over the number of friends and Input friend names
      for (int i = 0; i < numFriends; i++) {
        System.out.print("Ingrese el nombre del amigo " + (i + 1) + ": ");
        friends[i] = scanner.next();
      }

      System.out.println("List of friends:");
      for (String friend : friends) {
        System.out.println(friend);
      }

    } catch (InputMismatchException ime) {
      System.out.println("Input mismatch while reading the number of friends: " + ime.getMessage());
    } catch (Exception e) {
      System.out.println("An error occurred while reading the user input: " + e.getMessage());
    }

  }

}
