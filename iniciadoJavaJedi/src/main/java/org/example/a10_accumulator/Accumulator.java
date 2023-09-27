package org.example.a10_accumulator;

/*10. Accumulator: Store in a variable the accumulation of fifteen multiplications between two integers, divided by the number of the multiplication.

For example:
Number1*Number2/1 + Number1*Number2/2 + ... + Number1*Number2/15

Display the result on the screen.*/
public class Accumulator {
  public static void main(String[] args) {
    int n1 = 5;
    int n2 = 3;

    int accumulator =
        n1 * n2 / 1 + n1 * n2 / 2 + n1 * n2 / 3 + n1 * n2 / 4 + n1 * n2 / 5 + n1 * n2 / 6 + n1 * n2 / 7 + n1 * n2 / 8 + n1 * n2 / 9 + n1 * n2 / 10 + n1 * n2 / 11 + n1 * n2 / 12 + n1 * n2 / 13 + n1 * n2 / 14 + n1 * n2 / 15;
    System.out.println("accumulator: " + accumulator);
  }
/*si todos los operandos en una operación son enteros, el resultado será un entero, incluso si se produce una división.
 En este caso, la división n1 * n2 / x, donde x es un número entero, dará como resultado un número entero.*/

}
