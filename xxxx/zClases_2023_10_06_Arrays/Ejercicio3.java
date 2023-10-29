package org.example.zClases_2023_10_06_Arrays;

/* 3. Dado un array, escribe un programa que
 tome el primer y el segundo mejor valor y lo devuelva en un nuevo arreglo.
  myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
  firstSecond(myArray) // {90, 87}

Puedes encontrar el primer y segundo mejor valor en un array recorriendo el array una vez y realizando un seguimiento de los dos valores más grandes.
*/
public class Ejercicio3 {
  public static void main(String[] args) {
    int[] myArray = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
    int firstMax = Integer.MIN_VALUE; // Inicializamos con el valor mínimo posible
    int secondMax = Integer.MIN_VALUE; // Inicializamos con el valor mínimo posible

    // Recorremos el array para encontrar el primer y segundo mejor valor
    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] > firstMax) {
        secondMax = firstMax;
        firstMax = myArray[i];
      } else if (myArray[i] > secondMax && myArray[i] != firstMax) {
        secondMax = myArray[i];
      }
    }

    // Creamos un nuevo arreglo con los dos valores encontrados
    int[] resultArray = {firstMax, secondMax};
    System.out.println(resultArray[0]);
    System.out.println(resultArray[1]);

    // Imprimimos el resultado
    System.out.print("firstSecond(myArray): ");
    for (int i = 0; i < resultArray.length; i++) {
      System.out.print(resultArray[i]);
      if (i < resultArray.length - 1) {
        System.out.print(", "); // if para que no ponga coma al final
      }
    }
  }

}
