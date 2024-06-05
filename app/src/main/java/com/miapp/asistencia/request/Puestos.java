package com.miapp.asistencia.request;

import java.io.Serializable;

public class Puestos implements Serializable {
    private int Id;
    private String puesto;

    public Puestos() {

    }

    public Puestos(int id, String puesto) {
        Id = id;
        this.puesto = puesto;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Puestos{" +
                "Id=" + Id +
                ", puesto='" + puesto + '\'' +
                '}';
    }
}
