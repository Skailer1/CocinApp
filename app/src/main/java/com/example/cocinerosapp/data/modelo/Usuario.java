package com.example.cocinerosapp.data.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Usuario {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("nombreUsuario")
    @Expose
    private String nombreUsuario;
    @SerializedName("contrasenia")
    @Expose
    private String contrasenia;
    @SerializedName("correo")
    @Expose
    private String correo;
    @SerializedName("fechaActualizacion")
    @Expose
    private String fechaActualizacion;
    @SerializedName("fechaCreacion")
    @Expose
    private String fechaCreacion;
    @SerializedName("activo")
    @Expose
    private Boolean activo;

    public Usuario(Long id, String nombreUsuario, String contrasenia, String correo ,String fechaActualizacion, String fechaCreacion, Boolean activo) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.correo = correo;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaCreacion = fechaCreacion;
        this.activo = activo;
    }

    public Usuario(String nombreUsuario, String contrasenia, String correo) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.correo = correo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

}
