package org.example.tp1_imperativeProgramming_0k.aIniciadoJavaJedi_0k.a6_nombreBebida;

/* 6. Nombre de bebida: Guardar en espacios de memoria distinta la información de:
  El nombre de su última mascota y nombre de la última película vista.
 Por último mostrarlo por pantalla con el siguiente formato:
"Nombre de la próxima bebida: " {NombreDeUltimaMascota} {NombreDeUltimaPelícula}
*/

public class NombreBebida {
  public static void main(String[] args) {
    String NombreDeUltimaMascota = "Umma";
    String NombreDeUltimaPelicula = "Gods.Crooked.Lines.2022-Los_renglones_torcidos_de_Dios--española";

    System.out.println("\nNombre de la próxima bebida: " + NombreDeUltimaMascota + " " + NombreDeUltimaPelicula);
  }
}
