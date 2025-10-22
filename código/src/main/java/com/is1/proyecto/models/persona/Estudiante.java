package com.is1.proyecto.models.persona;

public class Estudiante extends PersonaAbs {
    public enum Estado {
        AVANZADO,
        INGRESANTE,
    }

    Estado estado;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
