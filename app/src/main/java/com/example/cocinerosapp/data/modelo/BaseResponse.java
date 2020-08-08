package com.example.cocinerosapp.data.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BaseResponse
{
    @SerializedName("codigoEstado")
    @Expose
    private int codigoEstado;
    @SerializedName("mensaje")
    @Expose
    private String mensaje;
    @SerializedName("correcto")
    @Expose
    private boolean correcto;

    public BaseResponse(int codigoEstado, String mensaje, boolean correcto) {
        this.codigoEstado = codigoEstado;
        this.mensaje = mensaje;
        this.correcto = correcto;
    }

    public BaseResponse() {
    }

    public int getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(int codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isCorrecto() {
        return correcto;
    }

    public void setCorrecto(boolean correcto) {
        this.correcto = correcto;
    }
}
