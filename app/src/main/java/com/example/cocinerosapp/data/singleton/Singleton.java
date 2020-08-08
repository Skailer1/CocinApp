package com.example.cocinerosapp.data.singleton;

public class Singleton {

    private static Singleton instancia;
    private Long usuarioId;
    private Long estadoId;
    private Long mesaId;
    private Long empleadoId;

    private Singleton() {
    }

    public synchronized static Singleton obtenerInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(Long estadoId) {
        this.estadoId = estadoId;
    }

    public Long getMesaId() {
        return mesaId;
    }

    public void setMesaId(Long mesaId) {
        this.mesaId = mesaId;
    }

    public Long getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Long empleadoId) {
        this.empleadoId = empleadoId;
    }

}
