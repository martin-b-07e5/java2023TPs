package org.example.a01_sumaDeDosNros;

public class Paridad {
  public static String paridad(int num1, int num2) {
    int suma = num1 + num2;
    return (suma % 2 == 0) ? "par" : "impar";
  }
}
