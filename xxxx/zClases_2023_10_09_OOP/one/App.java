package org.example.zClases_2023_10_09_OOP.one;

public class App {

  public static void main(String[] args) {
    Person person = new Person();
    person.setFn("Ian");
    person.setLn("Fernandez");
    person.setEdad(24);

    System.out.println(person.getFn());
    System.out.println(person.getLn());
    System.out.println(person.getEdad());

    if (person.getFn() != null) {
      person.setFn("Rodrigo"); // nunca  porque setFn no está en null
    }

  }


}
