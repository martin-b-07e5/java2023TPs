package org.example.tp1_0k.aIniciadoJavaJedi_0k.a08_nameAge;

/* 8. name and age: Save your first and last name and your age.
Print them on the screen.

The message should be in the following format:
"My name is " {First name}
"My age is" {Age}
*/
public class NameAge {

  public static void main(String[] args) {
    String fn = "Martín";
    String ln = "B";
    String fullName = fn + " " + ln + ".";
    int age = 21;

    System.out.println("My name is " + fullName);
    System.out.println("My age is " + age);
  }
}
