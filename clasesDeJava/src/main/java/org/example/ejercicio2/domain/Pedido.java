package org.example.ejercicio2.domain;

import org.example.ejercicio2.enums.EstadoPedidoEnum;

public class Pedido {

  private Long id;

  private Cliente cliente;

  // los requerimientos dice que tiene una lista de productos
  //  private List<Producto> productos = new ArrayList<>();
  private Carrito carrito;

  private EstadoPedidoEnum estado;

  //  constructors
  public Pedido() {
  }

  public Pedido(Long id, Cliente cliente, Carrito carrito, EstadoPedidoEnum estado) {
    this.id = id;
    this.cliente = cliente;
    this.carrito = carrito;
    this.estado = estado;
  }


  //  getters/setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Carrito getCarrito() {
    return carrito;
  }

  public void setCarrito(Carrito carrito) {
    this.carrito = carrito;
  }

  public EstadoPedidoEnum getEstado() {
    return estado;
  }

  public void setEstado(EstadoPedidoEnum estado) {
    this.estado = estado;
  }
}
