package org.example.zClases_2023_10_09_OOP.diagrama_de_clases;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Persona {

  private Long dni;
  private String nombre;
  private LocalDate fechaNacimiento;
  private Vehiculo vehiculo;

  //  constructor
  public Persona() {
  }

  public Persona(Long dni, LocalDate fechaNacimiento, Vehiculo vehiculo) {
    this.dni = dni;
    this.fechaNacimiento = fechaNacimiento;
    this.vehiculo = vehiculo;
  }

  //  getters setters
  public Long getDni() {
    return dni;
  }

  public void setDni(Long dni) {
    this.dni = dni;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public Vehiculo getVehiculo() {
    return vehiculo;
  }

  public void setVehiculo(Vehiculo vehiculo) {
    this.vehiculo = vehiculo;
  }
}
