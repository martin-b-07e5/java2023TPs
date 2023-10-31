package org.example.tp1_0k.aIniciadoJavaJedi_0k.a01_sumaDeDosNros;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("ingrese nro1");
    int num1 = scanner.nextInt();
    System.out.println("ingrese nro2");
    int num2 = scanner.nextInt();

    // Llamo a las funciones estáticas
    int suma = Suma.suma(num1, num2);
    String paridad = Paridad.paridad(num1, num2);

    System.out.printf("El resultado es " + suma + " y es " + paridad);
  }

}