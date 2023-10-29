package org.example.ejercicio2_carrito.domain;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
  private Long id;
  private String nombre;
  private String email;
  private String direccion;

  private Carrito carrito;
  private List<Pedido> pedidos = new ArrayList<Pedido>();


  //  constructors
  public Cliente() {
  }

  //  no se paso la lista pedidos en el constructor
  public Cliente(Long id, String nombre, String email, String direccion, Carrito carrito) {
    this.id = id;
    this.nombre = nombre;
    this.email = email;
    this.direccion = direccion;
    this.carrito = carrito;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public Carrito getCarrito() {
    return carrito;
  }

  public void setCarrito(Carrito carrito) {
    this.carrito = carrito;
  }

  public List<Pedido> getPedidos() {
    return pedidos;
  }

  public void setPedidos(List<Pedido> pedidos) {
    this.pedidos = pedidos;
  }

}
