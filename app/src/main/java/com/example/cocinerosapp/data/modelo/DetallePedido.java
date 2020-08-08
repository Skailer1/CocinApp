package com.example.cocinerosapp.data.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DetallePedido {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("cantidad")
    @Expose
    private int cantidad;
    @SerializedName("valorUnitario")
    @Expose
    private double valorUnitario;
    @SerializedName("activo")
    @Expose
    private double total;
    @SerializedName("activo")
    @Expose
    private boolean isActivo;
    @SerializedName("fechaCreacion")
    @Expose
    private String fechaCreacion;
    @SerializedName("fechaActualizacion")
    @Expose
    private String fechaActualizacion;

    public DetallePedido(Long id, int cantidad, double valorUnitario, double total, boolean isActivo, String fechaCreacion, String fechaActualizacion) {
        this.id = id;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
        this.total = total;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
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
