package org.example.ejercicio2.domain;

public class Producto {
  private Long id;
  private String nombre;
  private Double precio;
  private String description;
  private int stock; // esto está en "se pide"

  // constructors
  public Producto() {
  }

  public Producto(Long id, String nombre, Double precio, String description, int stock) {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
    this.description = description;
    this.stock = stock;
  }


  //  getters-setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Double getPrecio() {
    return precio;
  }

  public void setPrecio(Double precio) {
    this.precio = precio;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

}
