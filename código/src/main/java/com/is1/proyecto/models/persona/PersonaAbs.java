package com.is1.proyecto.models.persona;


import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;



//ESTA CLASE TIENE QUE SER ABSTRACTA
@Table("Persona")
public class PersonaAbs extends Model {
  // Atributos privados


  // Getters y setters usando ActiveJDBC
  public String getNombre() {
    return getString("nombre");
  }

  public void setNombre(String nombre) {
    set("nombre", nombre);
   
  }

  public String getApellido() {
    return getString("apellido");
  }

  public void setApellido(String apellido) {
    set("apellido", apellido);
    
  }

  public String getEmail() {
    return getString("email");
  }

  public void setEmail(String email) {
    set("email", email);
   
  }

  public String getDireccion() {
    return getString("direccion");
  }

  public void setDireccion(String direccion) {
    set("direccion", direccion);
 
  }

  public String getTelefono() {
    return getString("telefono");
  }

  public void setTelefono(String telefono) {
    set("telefono", telefono);

  }

  public Integer getDni() {
    return getInteger("dni");
  }

  public void setDni(Integer dni) {
    set("dni", dni);
   
  }

    public static PersonaAbs findByDni(Integer dni) {
        return findFirst("dni = ?", dni);
    }
    
    public static boolean existsByDni(Integer dni) {
        return count("dni = ?", dni) > 0;
    }
}
