package com.example.cocinerosapp.data.api;

import com.example.cocinerosapp.data.modelo.AuthToken;
import com.example.cocinerosapp.data.modelo.Empleado;
import com.example.cocinerosapp.data.modelo.EstadoPedido;
import com.example.cocinerosapp.data.modelo.LoginRequest;
import com.example.cocinerosapp.data.modelo.Pedido;
import com.example.cocinerosapp.data.modelo.TipoDocumento;
import com.example.cocinerosapp.data.modelo.TipoEmpleado;
import com.example.cocinerosapp.data.modelo.Usuario;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface WikiApiService {

    @POST("v1/usuario/login")
    Single<AuthToken> login(@Body LoginRequest loginRequest);

    @GET("v1/pedido")
    Single<List<Pedido>> obtenerPedidos(@Header("Authorization") String authorization);

    @GET("v1/tipoEmpleado")
    Single<List<TipoEmpleado>> obtenerRoles(@Header("Authorization") String authorization);

    @GET("v1/tipoDocumento")
    Single<List<TipoDocumento>> obtenerDocumentos(@Header("Authorization") String authorization);

    @POST("v1/empleado")
    Single<Empleado> crearEmpleado(@Body Empleado empleado, @Header("Authorization") String authorization );

    @POST("v1/usuario")
    Single<Usuario> crearUsuario(@Body Usuario usuario, @Header("Authorization") String authorization);

    @GET("v1/pedido/{id}")
    Single<List<Pedido>> obtenerPedido(@Path("id") Long id, @Header("Authorization") String authorization);

    @PUT("v1/estado/{id}")
    Single<EstadoPedido> actualizarEstado(@Path("id") Long id , @Body EstadoPedido estado, @Header("Authorization") String authorization );


}
