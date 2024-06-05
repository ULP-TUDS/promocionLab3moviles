package com.miapp.asistencia.request;

import java.io.Serializable;

public class Presencia implements Serializable {

private int presenciaId;
private int usuarioId;
private Usuario usuario;

private String fecha;
 private int zonaId;
 private Zona zona;

    public Presencia() {

    }
    public Presencia(int presenciaId, int usuarioId, Usuario usuario, String fecha, int zonaId, Zona zona) {
        this.presenciaId = presenciaId;
        this.usuarioId = usuarioId;
        this.usuario = usuario;
        this.fecha = fecha;
        this.zonaId = zonaId;
        this.zona = zona;
    }

    public int getPresenciaId() {
        return presenciaId;
    }

    public void setPresenciaId(int presenciaId) {
        this.presenciaId = presenciaId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getZonaId() {
        return zonaId;
    }

    public void setZonaId(int zonaId) {
        this.zonaId = zonaId;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Presencia{" +
                "presenciaId=" + presenciaId +
                ", usuarioId=" + usuarioId +
                ", usuario=" + usuario +
                ", fecha='" + fecha + '\'' +
                ", zonaId=" + zonaId +
                ", zona=" + zona +
                '}';
    }
}
