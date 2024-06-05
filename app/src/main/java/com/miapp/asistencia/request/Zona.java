package com.miapp.asistencia.request;

import java.io.Serializable;

public class Zona implements Serializable {
    private int Id;
    private String calle;
    private String desde;
    private String hasta;

    private Boolean seleccionada;

    public Zona() {
    }

    public Zona(int id, String calle, String desde, String hasta, Boolean seleccionada) {
        Id = id;
        this.calle = calle;
        this.desde = desde;
        this.hasta = hasta;
        this.seleccionada = seleccionada;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getDesde() {
        return desde;
    }

    public void setDesde(String desde) {
        this.desde = desde;
    }

    public String getHasta() {
        return hasta;
    }

    public void setHasta(String hasta) {
        this.hasta = hasta;
    }

    public Boolean getSeleccionada() {
        return seleccionada;
    }

    public void setSeleccionada(Boolean seleccionada) {
        this.seleccionada = seleccionada;
    }

    @Override
    public String toString() {
        return "Zona{" +
                "Id=" + Id +
                ", calle='" + calle + '\'' +
                ", desde='" + desde + '\'' +
                ", hasta='" + hasta + '\'' +
                ", seleccionada=" + seleccionada +
                '}';
    }
}
