package org.example.zClases_2023_09_29_Primos;

/* Dado un rango de numeros, es decir un número min y un número máx.
 Contar los numeros que van desde Min a Max que son primos
  y mostrarlos por pantalla. */
public class EjercicioIteraciones {

  public static void main(String[] args) {

    int min = 0;
    int max = 5;

    int contadorPrimos = 0;

    System.out.println("Números primos en el rango de " + min + " a " + max + ":");

    for (int numero = min; numero <= max; numero++) {
      if (numero <= 2) {
        if (numero == 2) {
          System.out.println(numero + " Es primo");
          contadorPrimos += 1;
        }
      } else {
        boolean esPrimo = true;
        for (int i = 2; i < numero; i++) {
          if (numero % i == 0) {
            esPrimo = false;
            break;
          }
        }
        if (esPrimo) {
          System.out.println(numero + " Es primo");
          contadorPrimos += 1;
        }
      }
    }

    System.out.println("\nEn el rango de " + min + " a " + max + " hay " + contadorPrimos + " números primos.");

  }

}

