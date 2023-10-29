package org.example.zClases_2023_09_29_Primos;

public class ContarPrimosEnRango {
  public static void main(String[] args) {
    int min = 1;
    int max = 11;
    int contadorPrimos = 0;

    System.out.println("Números primos en el rango de " + min + " a " + max + ":");

    for (int numero = min; numero <= max; numero++) {
      boolean esPrimo = true;

      if (numero <= 1) {
        esPrimo = false;
      } else {
        for (int i = 2; i < numero; i++) {
          if (numero % i == 0) {
            esPrimo = false;
            break;
          }
        }
      }

      if (esPrimo) {
        contadorPrimos++;
        System.out.println(numero + " es primo");
      }
    }

    System.out.println("\nEn el rango de " + min + " a " + max + " hay " + contadorPrimos + " números primos.");
  }
}

