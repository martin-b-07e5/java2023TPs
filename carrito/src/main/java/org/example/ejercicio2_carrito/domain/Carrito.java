package org.example.ejercicio2_carrito.domain;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
  private Long id;
  private Cliente cliente;
  private List<Producto> productos = new ArrayList<>();

  // ver de donde salió este req (es por la relación)
  private Pedido pedido;

  //  constructors
  public Carrito() {
  }

  public Carrito(Long id, Cliente cliente, List<Producto> productos, Pedido pedido) {
    this.id = id;
    this.cliente = cliente;
    this.productos = productos;
    this.pedido = pedido;
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

  public List<Producto> getProductos() {
    return productos;
  }

  public void setProductos(List<Producto> productos) {
    this.productos = productos;
  }

  public Pedido getPedido() {
    return pedido;
  }

  public void setPedido(Pedido pedido) {
    this.pedido = pedido;
  }

}
