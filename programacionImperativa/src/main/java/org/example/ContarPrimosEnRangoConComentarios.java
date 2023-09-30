package org.example;

public class ContarPrimosEnRangoConComentarios {
  public static void main(String[] args) {
    int min = 0; // Define el número mínimo
    int max = 5; // Define el número máximo

    int contadorPrimos = 0;

    System.out.println("Números primos en el rango de " + min + " a " + max + ":");

    for (int numero = min; numero <= max; numero++) {
      /*asumir inicialmente que el número es primo.
       Esto es una suposición inicial, y luego se verifica si esa suposición es correcta o no a medida que se examina el número.*/
      boolean esPrimo = true;

      if (numero <= 1) {
        esPrimo = false;
      } else {
        /*bucle para verificar si es divisible por algún número entre 2 y numero - 1.*/
        for (int i = 2; i < numero; i++) {
          /*Usamos el operador % (módulo) para calcular el resto de la división de numero entre i.
           Si el resto es igual a 0, significa que numero es divisible por i, lo que implicaría que no es primo.*/
          if (numero % i == 0) {
            esPrimo = false;
            break; // salir al encontrar un divisor
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

