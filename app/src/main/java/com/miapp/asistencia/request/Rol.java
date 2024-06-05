package com.miapp.asistencia.request;

import java.io.Serializable;

public class Rol implements Serializable {

    private int Id;

    private String nombre;

    public Rol() {

    }

    public Rol(int id, String nombre) {
        Id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "Id=" + Id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

