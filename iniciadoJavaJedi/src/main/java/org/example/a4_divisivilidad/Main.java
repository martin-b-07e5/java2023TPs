package org.example.a4_divisivilidad;

import java.util.Scanner;

/*4. Cálculo de divisibilidad: Guardar dos enteros y sumarlos.
Determinar si el primer número es divisible por el segundo número y muestre
el resultado.
*/
public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("ingrese nro1: ");
    int num1 = scanner.nextInt();
    System.out.println("ingrese nro2: ");
    int num2 = scanner.nextInt();

    // Llamo a las funciones estáticas
    int suma = Suma.suma(num1, num2);
    System.out.println("El resultado de la suma es: " + suma);

    String divisible = Divisible.divisible(num1, num2);
    System.out.println("El rto de la division es: " + divisible);
  }
}
