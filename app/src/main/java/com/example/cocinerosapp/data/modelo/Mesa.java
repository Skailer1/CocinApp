package com.example.cocinerosapp.data.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mesa {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("nombreMesa")
    @Expose
    private String nombre;
    @SerializedName("imagenUrl")
    @Expose
    private String imagenUrl;
    @SerializedName("activo")
    @Expose
    private boolean isActivo;
    @SerializedName("fechaCreacion")
    @Expose
    private String fechaCreacion;
    @SerializedName("fechaActualizacion")
    @Expose
    private String fechaActualizacion;

    public Mesa(Long id, String nombre, String imagenUrl, boolean isActivo, String fechaCreacion, String fechaActualizacion) {
        this.id = id;
        this.nombre = nombre;
        this.imagenUrl = imagenUrl;
        this.isActivo = isActivo;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return isActivo;
    }

    public void setActivo(boolean activo) {
        isActivo = activo;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

}
