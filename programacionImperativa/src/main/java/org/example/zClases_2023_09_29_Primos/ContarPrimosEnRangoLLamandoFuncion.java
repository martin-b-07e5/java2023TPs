package org.example.zClases_2023_09_29_Primos;

public class ContarPrimosEnRangoLLamandoFuncion {

  public static void main(String[] args) {
    int min = 1; // Define el número mínimo
    int max = 5; // Define el número máximo

    int contadorPrimos = 0;

    System.out.println("Números primos en el rango de " + min + " a " + max + ":");

    for (int numero = min; numero <= max; numero++) {
      if (esPrimo(numero)) {
        contadorPrimos++;
        System.out.println(numero + " es primo");
      }
    }

    System.out.println("\nEn el rango de " + min + " a " + max + " hay " + contadorPrimos + " números primos.");
  }

  // Función para verificar si un número es primo
  public static boolean esPrimo(int numero) {
    if (numero <= 1) {
      return false;
    }
    /*se itera desde 2 hasta numero - 1,
      y si en algún momento se encuentra un divisor (es decir, numero % i == 0), se devuelve false.
     De lo contrario, si ningún divisor es encontrado, se devuelve true.*/
    for (int i = 2; i < numero; i++) {
      if (numero % i == 0) {
        return false;
      }
    }
    return true;
  }

}