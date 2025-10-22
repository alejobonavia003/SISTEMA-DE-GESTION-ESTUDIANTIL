package com.is1.proyecto.models.persona;


import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;




@Table("Persona")
public abstract class PersonaAbs extends Model {
  // Atributos privados
  private String nombre;
  private String apellido;
  private String email;
  private String direccion;
  private String telefono;
  private Integer edad;
  private Integer dni;

  // Getters y setters usando ActiveJDBC
  public String getNombre() {
    return getString("nombre");
  }

  public void setNombre(String nombre) {
    set("nombre", nombre);
    this.nombre = nombre;
  }

  public String getApellido() {
    return getString("apellido");
  }

  public void setApellido(String apellido) {
    set("apellido", apellido);
    this.apellido = apellido;
  }

  public String getEmail() {
    return getString("email");
  }

  public void setEmail(String email) {
    set("email", email);
    this.email = email;
  }

  public String getDireccion() {
    return getString("direccion");
  }

  public void setDireccion(String direccion) {
    set("direccion", direccion);
    this.direccion = direccion;
  }

  public String getTelefono() {
    return getString("telefono");
  }

  public void setTelefono(String telefono) {
    set("telefono", telefono);
    this.telefono = telefono;
  }

  public Integer getEdad() {
    return getInteger("edad"); 
  }

  public void setEdad(Integer edad) {
    set("edad", edad);
    this.edad = edad;
  }

  public Integer getDni() {
    return getInteger("dni");
  }

  public void setDni(Integer dni) {
    set("dni", dni);
    this.dni = dni;
  }
}
