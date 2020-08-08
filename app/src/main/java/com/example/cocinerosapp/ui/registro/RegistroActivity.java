package com.example.cocinerosapp.ui.registro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.cocinerosapp.R;
import com.example.cocinerosapp.ui.MenuActivity;
import com.example.cocinerosapp.ui.login.LoginActivity;

public class RegistroActivity extends AppCompatActivity {

    private EditText txtNombreUsuario;
    private EditText txtTelefono;
    private EditText txtDireccion;
    private EditText txtNumeroDocumento;
    private EditText txtRh;
    private EditText txtSexo;
    private EditText txtTipoDocumento;
    private EditText txtTipoEmpleado;
    private Spinner tipoEmpleadoList;
    //  private Singleton singleton;
    private RegistroViewModel registroViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        txtNombreUsuario = findViewById(R.id.txtEmpleado);
        txtDireccion =  findViewById(R.id.txtDireccion);
        txtTelefono =  findViewById(R.id.txtTelefono);
        txtNumeroDocumento =  findViewById(R.id.txtNumeroDocumento);
        txtRh =  findViewById(R.id.txtRh);
        txtSexo =  findViewById(R.id.txtSexo);
        txtTipoDocumento =  findViewById(R.id.txtTipoDocumento);
        txtTipoEmpleado =  findViewById(R.id.txtTipoEmpleado);
    //    tipoEmpleadoList = findViewById(R.id.spinnerEmpleado);
        //singleton = Singleton.obtenerInstancia();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Registro");
        registroViewModel = new ViewModelProvider(this).get(RegistroViewModel.class);
        observableViewModel();
    }

    private void observableViewModel() {
        registroViewModel.getEmpleado().observe(this, empleado -> {
            if (empleado != null) {
                // singleton.getUsuarioId();
                Toast.makeText(this, "Se ha creado un nuevo empleado", Toast.LENGTH_SHORT).show();
                Intent intent  = new Intent (RegistroActivity.this, LoginActivity.class  );
                startActivity(intent);
                finish();

            }
        });

        registroViewModel.getError().observe(this, error -> {
            if (error != null) {
                Toast.makeText(this, error.getMensaje(), Toast.LENGTH_SHORT).show();
            }
        });
    }



    public void btnSesionClick(View view){


        registroViewModel.crearEmpleado(txtNombreUsuario.getText().toString(),
                Long.parseLong(txtTelefono.getText().toString()), txtRh.getText().toString(),
                txtSexo.getText().toString(), txtTipoDocumento.getText().toString(),
                txtTipoEmpleado.getText().toString(), Long.parseLong(txtNumeroDocumento.getText().toString()),
                txtDireccion.getText().toString()) ;


    }

}
