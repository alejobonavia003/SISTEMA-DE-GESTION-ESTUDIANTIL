package com.is1.proyecto.models.persona;


import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;
@Table("Profesor")

public class Profesor extends PersonaAbs {
    String idProfesor;
    public String getIdProfesor() {
        return getString("id_doc");
    }

    public void setIdProfesor(String idProfesor) {
        set("id_doc", idProfesor);
        this.idProfesor = idProfesor;
    }
}
