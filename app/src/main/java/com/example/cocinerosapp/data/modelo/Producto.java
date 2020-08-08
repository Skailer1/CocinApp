package com.example.cocinerosapp.data.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Producto {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("cantidadEnStock")
    @Expose
    private Integer cantidadEnStock;
    @SerializedName("imagenUrl")
    @Expose
    private String imagenUrl;
    @SerializedName("costo")
    @Expose
    private Double costo;
    @SerializedName("fechaCreacion")
    @Expose
    private String fechaCreacion;
    @SerializedName("fechaActualizacion")
    @Expose
    private String fechaActualizacion;
    @SerializedName("nombreProducto")
    @Expose
    private String nombreProducto;
    @SerializedName("iva")
    @Expose
    private Double iva;
    @SerializedName("tipoProducto")
    @Expose
    private TipoProducto tipoProducto;

    public Producto(Long id, Integer cantidadEnStock, String fotoProducto, Double costo, String fechaCreacion, String fechaActualizacion, String nombreProducto, Double iva, TipoProducto tipoProducto, Boolean activo) {
        this.id = id;
        this.cantidadEnStock = cantidadEnStock;
        this.imagenUrl = fotoProducto;
        this.costo = costo;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
        this.nombreProducto = nombreProducto;
        this.iva = iva;
        this.tipoProducto = tipoProducto;
        this.activo = activo;
    }

    @SerializedName("activo")
    @Expose



    private Boolean activo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(Integer cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
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

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

}
