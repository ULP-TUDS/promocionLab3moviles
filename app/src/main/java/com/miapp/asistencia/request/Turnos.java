package com.miapp.asistencia.request;

import java.io.Serializable;

public class Turnos implements Serializable {
    private int Id;
    private String turno;

    public Turnos() {
    }

    public Turnos(int id, String turno) {
        Id = id;
        this.turno = turno;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Turnos{" +
                "Id=" + Id +
                ", turno='" + turno + '\'' +
                '}';
    }
}
