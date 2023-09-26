package org.example.a4_divisivilidad;

public class Divisible {
  public static String divisible(int num1, int num2) {
    int xx = num1 / num2;
//    casting to String
//    return (num1 % num2 == 0) ? xx + "" : "No es división exacta";
    return (num1 % num2 == 0) ? String.valueOf(xx) : "No son divisibles";
  }
}
