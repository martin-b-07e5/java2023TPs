package org.example.zClases_2023_10_06_Arrays;

/* 1. Escribe un programa
 que tome un array y cree otro array
  que contenga solo los elementos del medio,
  es decir, eliminando el primer y último elemento.

 myArray = [1, 2, 3, 4]
 middle(myArray)  # [2,3]

Esto está mal. No usar funciones, porque todavía no la vimos
*/

public class Ejercicio1 {

  public static void main(String[] args) {
    int[] miArray = {1, 2, 3, 4, 5};
    int[] resultado = middleElements(miArray);

    // Imprimimos el resultado
    for (int elemento : resultado) {
      System.out.print(elemento + " ");
    }
  }

  public static int[] middleElements(int[] array) {
    // Verificamos si el array tiene al menos 3 elementos
    if (array.length < 3) {
      System.out.println("El array debe contener al menos 3 elementos");
      return null; // Puedes manejar este caso de error según tus necesidades
    }

    // Creamos un nuevo array con un tamaño 2 menos que el original
    int[] elementosMedio = new int[array.length - 2];

    // Copiamos los elementos del medio al nuevo array
    for (int i = 1; i < array.length - 1; i++) {
      elementosMedio[i - 1] = array[i];
    }

    return elementosMedio;
  }


}


