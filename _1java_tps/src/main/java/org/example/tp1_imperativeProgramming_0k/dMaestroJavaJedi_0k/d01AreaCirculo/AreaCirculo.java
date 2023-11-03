package org.example.tp1_imperativeProgramming_0k.dMaestroJavaJedi_0k.d01AreaCirculo;

/* calcule el área de un círculo con un radio de 5 unidades.
 area= pi x r²

  */
public class AreaCirculo {

  public static void main(String[] args) {
    int radio = 5;
    double pi = 3.1416D;

    double area = pi * radio * radio;
    double area2 = Math.PI * Math.pow(radio, 2);

    System.out.println("radio: " + radio);
    System.out.println("pi:" + Math.PI);
    System.out.println("area: " + area);
    System.out.println("area2: " + area2);
  }

}
