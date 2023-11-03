package org.example.tp1_imperativeProgramming_0k.bPadawanJavaJedi_0k.b03_characters;

/* 3.Chars: Guarde en distintos espacios de memoria los caracteres de su nombre EN UNICODE y luego imprimirlos por pantalla.
¿Por qué no puede usar "" en el char?
In Java, individual characters are represented with single quotes ('), while strings are represented with double quotes (").
 This syntax distinction is important.
 For example, 'A' signifies the character 'A', whereas "Hello" denotes the string "Hello".
 Using double quotes for a single character would lead to a compilation error, as Java expects a string, not a character.
 Therefore, in Java, single quotes are used exclusively for single characters.

*/

/* ¿Qué es unicode?
Unicode es un estándar de codificación de caracteres diseñado para facilitar el tratamiento informático, transmisión, y visualización de textos de numerosos idiomas y disciplinas técnicas, además de textos clásicos de lenguas muertas. El término Unicode proviene de los tres objetivos perseguidos: universalidad, uniformidad, y unicidad.

Unicode define cada carácter o símbolo mediante un nombre e identificador numérico, el punto de código (code point). Además incluye otras informaciones para el uso correcto de cada carácter, como sistema de escritura, categoría, direccionalidad, mayúsculas y otros atributos. Unicode trata los caracteres alfabéticos, ideográficos y símbolos de forma equivalente, lo que significa que se pueden mezclar en un mismo texto sin utilizar marcas o caracteres de control.

Este estándar es mantenido por el Unicode Technical Committee (UTC), integrado en el Consorcio Unicode, del que forman parte con distinto grado de implicación empresas como: Microsoft, Apple, Adobe, IBM, Oracle, SAP, Google o Facebook, instituciones como la Universidad de Berkeley, o el Gobierno de la India y profesionales y académicos a título individual.
 El Unicode Consortium mantiene estrecha relación con ISO/IEC, con la que mantiene desde 1991 el acuerdo de sincronizar sus estándares que contienen los mismos caracteres y puntos de código.
*/
public class Chars {
  public static void main(String[] args) {
    // Declare char variables to store individual characters
    char ch1 = 'Ⓜ';
    char ch2 = 'ⓐ';
    char ch3 = 'ⓡ';
    char ch4 = 'ⓣ';
    char ch5 = 'ⓘ';
    char ch6 = 'ⓝ';
    char ch7 = '✨';
    System.out.printf("PositiveNegativeZero: " + ch1 + ch2 + ch3 + ch4 + ch5 + ch6 + " " + ch7);
  }

}
