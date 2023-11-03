package org.example.tp2_structuredProgramming.aIniciadoJavaJedi_0k._07_grades;

/* Print a title for the program,
Then a list (followed, NOT with line breaks) of the N grades of my exams,
  where the N numbers are stored in variables or constants as appropriate.
Then get the average of those grades
and tell me if I passed or failed and by how much.

*/

public class Grades {

  public static void main(String[] args) {
    double nota1 = 70.50;
    double nota2 = 60.90;
    double nota3 = 80;
    double promedio = (nota1 + nota2 + nota3) / 3;

    System.out.println("Título del programa");
    System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
    if (promedio >= 70) {
      System.out.println("aprobaste con promedio: " + promedio);
    } else
      System.out.println("desaprobaste con promedio: " + promedio);
  }

}
