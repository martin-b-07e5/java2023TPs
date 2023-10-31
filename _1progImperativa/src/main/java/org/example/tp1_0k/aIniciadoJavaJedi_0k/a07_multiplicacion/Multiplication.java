package org.example.tp1_0k.aIniciadoJavaJedi_0k.a07_multiplicacion;

/*7. Multiplication: Store two real numbers and multiply them.
Then store two other integers and multiply them.
Save in a memory space the sum between these two multiplications.
What result does it give you, integer or real? Why?

https://www.w3schools.com/java/java_type_casting.asp
Widening casting is done automatically when passing a smaller size type to a larger size type.
*/
public class Multiplication {

  public static void main(String[] args) {
    double double1 = 2.99d;
    double double2 = 15.55d;
    double multiplicationDouble = double1 * double2;

    int int1 = 2;
    int int2 = 15;
    int multiplicationInt = int1 * int2;

    double resultado = multiplicationDouble + multiplicationInt;
    System.out.println("Widening casting is done automatically when passing a smaller size type to a larger size.\n" +
        "type: " + resultado + "d");
  }

}
