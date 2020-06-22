package com.example.cocinerosapp.Estructural;

public class BaseResponse
{
    private String mensaje;
    private boolean correcto;

    public BaseResponse(String mensaje, boolean correcto) {
        this.mensaje = mensaje;
        this.correcto = correcto;
    }

    public BaseResponse() {
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
