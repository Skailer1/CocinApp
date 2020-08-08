package com.example.cocinerosapp.ui.usuario;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cocinerosapp.R;
import com.example.cocinerosapp.ui.login.LoginActivity;
import com.example.cocinerosapp.ui.registro.RegistroActivity;

public class UsuarioActivity extends AppCompatActivity {

    private EditText txtNombre;
    private EditText txtCorreo;
    private EditText txtContrasenia;
    //private Singleton singleton;
    private UsuarioViewModel usuarioViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
        txtNombre =  findViewById(R.id.txtNombre);
        txtCorreo = findViewById(R.id.txtCorreo);
        txtContrasenia =  findViewById(R.id.txtContrasenia);
        //  singleton = Singleton.obtenerInstancia();
        getSupportActionBar().setTitle("Usuario");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        usuarioViewModel = new ViewModelProvider(this).get(UsuarioViewModel.class);
        observableViewModel();
    }

    private void observableViewModel() {
        usuarioViewModel.getUsuario().observe(this, usuario -> {
            if (usuario != null) {
                Toast.makeText(this, "Se ha creado un nuevo usuario", Toast.LENGTH_SHORT).show();
                //        singleton.setUsuarioId(usuario.getId());
                Intent intent  = new Intent (UsuarioActivity.this, LoginActivity.class  );
                startActivity(intent);
                finish();

            }
        });

        usuarioViewModel.getError().observe(this, error -> {
            if (error != null) {
                Toast.makeText(this, error.getMensaje(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void btnTipoEmpleadoClick (View view ) {


        usuarioViewModel.crearUsuario(  txtNombre.getText().toString(),
                txtCorreo.getText().toString(),  txtContrasenia.getText().toString());

    }

}
