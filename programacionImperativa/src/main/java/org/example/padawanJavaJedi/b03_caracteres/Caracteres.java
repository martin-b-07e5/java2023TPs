package org.example.padawanJavaJedi.b03_caracteres;

/* 3.Caracteres: Guarde en distintos espacios de memoria los caracteres de su nombre EN UNICODE y luego imprimirlos por pantalla.
¿Por qué no puede usar "" en el char?
In Java, individual characters are represented with single quotes ('), while strings are represented with double quotes (").
 This syntax distinction is important.
 For example, 'A' signifies the character 'A', whereas "Hello" denotes the string "Hello".
 Using double quotes for a single character would lead to a compilation error, as Java expects a string, not a character.
 Therefore, in Java, single quotes are used exclusively for single characters.

¿Qué es unicode?

*/
public class Caracteres {
  public static void main(String[] args) {
    // Declare char variables to store individual characters
    char ch1 = 'Ⓜ';
    char ch2 = 'ⓐ';
    char ch3 = 'ⓡ';
    char ch4 = 'ⓣ';
    char ch5 = 'ⓘ';
    char ch6 = 'ⓝ';
    char ch7 = '✨';
    System.out.printf("Name: " + ch1 + ch2 + ch3 + ch4 + ch5 + ch6 + " " + ch7);
  }

}
