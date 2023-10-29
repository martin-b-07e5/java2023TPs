package org.example.zClases_2023_10_06_Arrays;

/* 2. Dado un array en 2D calcula la suma de los elementos en diagonal
     myArray2D= {
       {1,2,3},
       {4,5,6},
       {7,8,9}
     };

     tengo que sumar 1+5+9

     Para calcular la suma de los elementos en la diagonal de un array 2D,
      puedes recorrer la matriz y sumar los elementos cuyas coordenadas (fila y columna) son las mismas.
*/
public class Ejercicio2 {
  public static void main(String[] args) {
    int[][] myArray2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int sumaDiagonal = 0;

    // Recorremos la matriz y sumamos los elementos en la diagonal
    for (int i = 0; i < myArray2D.length; i++) {
      System.out.println("i:" + i);
      System.out.println("myArray2D[i][i]: " + myArray2D[i][i]);
      sumaDiagonal += myArray2D[i][i];
    }

    System.out.println("\nLa suma de los elementos en la diagonal es: " + sumaDiagonal);
  }
}
