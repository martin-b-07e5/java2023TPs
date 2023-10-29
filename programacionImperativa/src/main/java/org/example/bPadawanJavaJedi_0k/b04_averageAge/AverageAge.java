package org.example.bPadawanJavaJedi_0k.b04_averageAge;

/* Average age :
  Store different age values and the names of those people in different memory spaces.
  Then take your average and print the person's name and age on the screen.
  Finally print the average of your
ages.
*/
public class AverageAge {

  public static void main(String[] args) {
    int age1 = 12;
    int age2 = 22;
    int age3 = 33;
    float averageAge = (age1 + age2 + age3) / 3.0f;
    float averageAge1 = (float) (age1 + age2 + age3) / 3.0f;
    float averageAge2 = (float) ((age1 + age2 + age3) / 3.0);

    String name1 = "Juan";
    String name2 = "José";
    String name3 = "Luis";

    System.out.println("name: " + name1 + ", age: " + age1);
    System.out.println("name: " + name2 + ", age: " + age2);
    System.out.println("name: " + name3 + ", age: " + age3);

    System.out.println("\naverageAge: " + averageAge);
    System.out.println("averageAge1: " + averageAge1);
    System.out.println("averageAge2: " + averageAge2);
  }

}
