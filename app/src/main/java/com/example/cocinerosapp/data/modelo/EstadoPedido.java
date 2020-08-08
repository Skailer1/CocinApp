package com.example.cocinerosapp.data.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EstadoPedido {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("descripcionEstado")
    @Expose
    private String descripcionEstado;
    @SerializedName("fechaActualizacion")
    @Expose
    private String fechaActualizacion;
    @SerializedName("fechaCreacion")
    @Expose
    private String fechaCreacion;
    @SerializedName("activo")
    @Expose
    private Boolean activo;

    public EstadoPedido(Long id, String descripcionEstado, String fechaActualizacion, String fechaCreacion, Boolean activo) {
        this.id = id;
        this.descripcionEstado = descripcionEstado;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaCreacion = fechaCreacion;
        this.activo = activo;
    }

    public EstadoPedido(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String estado() {
        return descripcionEstado;
    }

    public void setDescripcionEstado(String estado) {
        this.descripcionEstado = estado;
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
