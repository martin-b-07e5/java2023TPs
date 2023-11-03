package org.example.tp1_imperativeProgramming_0k.aIniciadoJavaJedi_0k.a01_sumaDeDosNros;

public class Paridad {
  public static String paridad(int num1, int num2) {
    int suma = num1 + num2;
    return (suma % 2 == 0) ? "par" : "impar";
  }
}
