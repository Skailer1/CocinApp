package com.example.cocinerosapp.data.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TipoDocumento {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("fechaCreacion")
    @Expose
    private String fechaCreacion;
    @SerializedName("fechaActualizacion")
    @Expose
    private String fechaActualizacion;
    @SerializedName("descripcionDocumento")
    @Expose
    private String descripcionDocumento;
    @SerializedName("activo")
    @Expose
    private Boolean activo;

    public TipoDocumento(Long id, String fechaCreacion, String fechaActualizacion, String descripcionDocumento, Boolean activo) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
        this.descripcionDocumento = descripcionDocumento;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
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

    public String getDescripcionDocumento() {
        return descripcionDocumento;
    }

    public void setDescripcionDocumento(String descripcionDocumento) {
        this.descripcionDocumento = descripcionDocumento;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }


}
