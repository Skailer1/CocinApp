package com.example.cocinerosapp.data.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Empleado {


    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("telefono")
    @Expose
    private Long telefono;
    @SerializedName("rh")
    @Expose
    private String rh;
    @SerializedName("sexo")
    @Expose
    private String sexo;
    @SerializedName("tipoDocumento")
    @Expose
    private String tipoDocumento;
    @SerializedName("tipoEmpleado")
    @Expose
    private String tipoEmpleado;
    @SerializedName("numeroDocumento")
    @Expose
    private Long numeroDocumento;
    @SerializedName("direccion")
    @Expose
    private String direccion;
    @SerializedName("activo")
    @Expose
    private Boolean activo;
    @SerializedName("fechaCreacion")
    @Expose
    private String fechaCreacion;
    @SerializedName("fechaActualizacion")
    @Expose
    private String fechaActualizacion;
    @SerializedName("usuarioId")
    @Expose
    private Usuario usuarioId;

    public Empleado( Long id, String nombre, Long telefono, String rh, String sexo, String tipoDocumento, String tipoEmpleado, Long numeroDocumento, String direccion, Boolean activo, String fechaCreacion, String fechaActualizacion, Usuario usuarioId) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.rh = rh;
        this.sexo = sexo;
        this.tipoDocumento = tipoDocumento;
        this.tipoEmpleado = tipoEmpleado;
        this.numeroDocumento = numeroDocumento;
        this.direccion = direccion;
        this.activo = activo;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
        this.usuarioId = usuarioId;
    }

    public Empleado(String nombre, Long telefono, String rh, String sexo, String tipoDocumento, String tipoEmpleado, Long numeroDocumento, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.rh = rh;
        this.sexo = sexo;
        this.tipoDocumento = tipoDocumento;
        this.tipoEmpleado = tipoEmpleado;
        this.numeroDocumento = numeroDocumento;
        this.direccion = direccion;
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

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public Long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

}
