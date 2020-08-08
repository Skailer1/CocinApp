package com.example.cocinerosapp.data.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pedido {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("fechaPedido")
    @Expose
    private String fechaPedido;
    @SerializedName("activo")
    @Expose
    private boolean isActivo;
    @SerializedName("fechaCreacion")
    @Expose
    private String fechaCreacion;
    @SerializedName("fechaActualizacion")
    @Expose
    private String fechaActualizacion;
    @SerializedName("mesaId")
    @Expose
    private Mesa mesaId;
    @SerializedName("empleadoId")
    @Expose
    private Empleado empleadoId;
    @SerializedName("estadoId")
    @Expose
    private EstadoPedido estadoId;

    public Pedido(Long id, String fechaPedido, boolean isActivo, String fechaCreacion, String fechaActualizacion, Mesa mesaId, Empleado empleadoId, EstadoPedido estadoId) {
        this.id = id;
        this.fechaPedido = fechaPedido;
        this.isActivo = isActivo;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
        this.mesaId = mesaId;
        this.empleadoId = empleadoId;
        this.estadoId = estadoId;
    }


    public Pedido() {

    }

    public Pedido(Long id) {
        this.id = id;
    }

    public boolean isActivo() {
        return isActivo;
    }

    public void setActivo(boolean activo) {
        isActivo = activo;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
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

    public Empleado getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Empleado empleadoId) {
        this.empleadoId = empleadoId;
    }

    public Mesa getMesaId() {
        return mesaId;
    }

    public void setMesaId(Mesa mesaId) {
        this.mesaId = mesaId;
    }

    public EstadoPedido getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(EstadoPedido estadoId) {
        this.estadoId = estadoId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
