package com.example.cocinerosapp.ui.login;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

import com.example.cocinerosapp.R;
import com.example.cocinerosapp.ui.MenuActivity;
import com.example.cocinerosapp.ui.usuario.UsuarioActivity;


public class LoginActivity extends AppCompatActivity {

    private EditText txtEmail;
    private EditText txtPassword;
    private LoginViewModel loginViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        txtEmail = findViewById(R.id.txtEmail);
        txtPassword = findViewById(R.id.txtPassword);
        loginViewModel = new ViewModelProvider(this).get(LoginViewModel.class);
        observableViewModel();
        getSupportActionBar().setTitle("Login");


    }

    private void observableViewModel() {
        loginViewModel.getAuthToken().observe(this, authToken -> {
            if (authToken != null) {
                Intent intent1 = new Intent(LoginActivity.this, MenuActivity.class);
                startActivity(intent1);
                finish();

            }
        });

        loginViewModel.getError().observe(this, error -> {
            if (error != null) {
                Toast.makeText(this, error.getMensaje(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void btnLoginIdClick(View view) {
        loginViewModel.login(txtEmail.getText().toString(), txtPassword.getText().toString());
    }


    public void btnUsuarioClick(View view) {
        Intent intent2 = new Intent(LoginActivity.this, UsuarioActivity.class);
        startActivity(intent2);
    }

}
