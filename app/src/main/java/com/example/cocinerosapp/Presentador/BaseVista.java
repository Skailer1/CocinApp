package com.example.cocinerosapp.Presentador;

import android.content.Context;

public interface BaseVista
{
    Context getContext();

    void mostrarMensaje(String mensaje);
}
