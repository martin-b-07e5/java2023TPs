package org.example.zClases_2023_10_09_OOP.one;

public class Person {
  //  atributos
  private String fn;
  private String ln;
  private int edad;

  //  getters
  public String getFn() {
    return fn;
  }

  public String getLn() {
    return ln;
  }

  public int getEdad() {
    return edad;
  }


  //  setters
  public void setFn(String fn) {
    if (this.fn == null) {
      this.fn = fn;
    }

  }

  public void setLn(String ln) {
    this.ln = ln;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }


  //  constructors
  public Person() {
  }

  public Person(String fn, String ln, int edad) {
    this.fn = fn;
    this.ln = ln;
    this.edad = edad;
  }
}
