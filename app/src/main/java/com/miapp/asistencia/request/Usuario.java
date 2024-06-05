package com.miapp.asistencia.request;

import java.io.Serializable;

public class Usuario implements Serializable {


    private int usuarioId;


    private String nombre;


    private String apellido;


    private String documento;


    private String password;


    private String email;


    private String telefono;


    private String foto;

    private int puestoId;
    private Puestos puesto;

    private int rolId;
    private Rol rol;

    private int turnosId;
    private Turnos turnos;

    private boolean Semana;


    public Usuario() {
    }

    public Usuario(int usuarioId, String nombre, String apellido, String documento, String password, String email, String telefono, String foto, int puestoId, Puestos puesto, int rolId, Rol rol, int turnosId, Turnos turnos, boolean semana) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.password = password;
        this.email = email;
        this.telefono = telefono;
        this.foto = foto;
        this.puestoId = puestoId;
        this.puesto = puesto;
        this.rolId = rolId;
        this.rol = rol;
        this.turnosId = turnosId;
        this.turnos = turnos;
        Semana = semana;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getPuestoId() {
        return puestoId;
    }

    public void setPuestoId(int puestoId) {
        this.puestoId = puestoId;
    }

    public Puestos getPuesto() {
        return puesto;
    }

    public void setPuesto(Puestos puesto) {
        this.puesto = puesto;
    }

    public int getRolId() {
        return rolId;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public int getTurnosId() {
        return turnosId;
    }

    public void setTurnosId(int turnosId) {
        this.turnosId = turnosId;
    }

    public Turnos getTurnos() {
        return turnos;
    }

    public void setTurnos(Turnos turnos) {
        this.turnos = turnos;
    }

    public boolean isSemana() {
        return Semana;
    }

    public void setSemana(boolean semana) {
        Semana = semana;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuarioId=" + usuarioId +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", documento='" + documento + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", foto='" + foto + '\'' +
                ", puestoId=" + puestoId +
                ", puesto=" + puesto +
                ", rolId=" + rolId +
                ", rol=" + rol +
                ", turnosId=" + turnosId +
                ", turnos=" + turnos +
                ", Semana=" + Semana +
                '}';
    }
}
