package org.example.zClases_2023_10_02_Arrays;

public class Arrays {
  public static void main(String[] args) {
//    El uso de new es necesario porque esto reserva espacio en memoria para el arreglo y
//    lo inicializa con valores predeterminados (0 para tipos numéricos, null para tipos de referencia como String).
    int[] array1 = new int[]{1, 2, 3, 4, 5};

//    Sin embargo, hay una forma abreviada de inicializar arreglos en la misma línea en la que se declaran:
    int[] array2 = {1, 2, 3, 4, 5};  // también reserva espacio en memoria.

    int[] array3 = new int[]{1};


    System.out.println("----------");
    System.out.println("array1[0]: " + array1[0]);
    System.out.println("array2[0]: " + array2[0]);
    System.out.println("array3[0]: " + array3[0]);


//    filas 5, columnas 7
    int[][] arr4 = new int[5][7];
    int filas = arr4.length;
    int columnasEnPrimeraFila = arr4[0].length;
    int columnasEnSegundaFila = arr4[4].length;
    System.out.println("filas: " + filas);
    System.out.println("columnasEnPrimeraFila: " + columnasEnPrimeraFila);
    System.out.println("columnasEnSegundaFila: " + columnasEnSegundaFila);


    System.out.println("\nRecorremos array");

    System.out.println("\nposic 1,2=7");
    int[][] myNumbers1 = {{1, 2, 3, 4}, {5, 6, 7}};
    System.out.println(myNumbers1[1][2]);

    System.out.println("\nfor común");
    for (int i = 0; i < myNumbers1.length; ++i) {
      for (int j = 0; j < myNumbers1[i].length; ++j) {
        System.out.println(myNumbers1[i][j]);
      }
      System.out.println(); // Salto de línea después de cada fila
    }


    System.out.println("\nforeach");
    for (int[] fila : myNumbers1) {
      for (int elemento : fila) {
        System.out.print(elemento + " ");
      }
      System.out.println();
    }


  }
}
