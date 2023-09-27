package org.example.iniciadoJavaJedi.a03_caracteres;

/*3. Caracteres: Guarde en distintos espacios de memoria los caracteres de su nombre
y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?

In Java, individual characters are represented with single quotes ('), while strings are represented with double quotes (").
 This syntax distinction is important.
 For example, 'A' signifies the character 'A', whereas "Hello" denotes the string "Hello".
 Using double quotes for a single character would lead to a compilation error, as Java expects a string, not a character.
 Therefore, in Java, single quotes are used exclusively for single characters.
*/
public class Caracteres {
  public static void main(String[] args) {
    // Declare char variables to store individual characters
    char ch1 = 'M';
    char ch2 = 'a';
    char ch3 = 'r';
    char ch4 = 't';
    char ch5 = 'í';
    char ch6 = 'n';
    System.out.printf("Name: " + ch1 + ch2 + ch3 + ch4 + ch5 + ch6);
  }
}
