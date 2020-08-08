package com.example.cocinerosapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cocinerosapp.R;
import com.example.cocinerosapp.ui.pedido.PedidoActivity;
import com.example.cocinerosapp.ui.usuario.UsuarioActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().setTitle("Menu");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void btnPagoActivityClick(View view){

        Intent intent2  = new Intent (MenuActivity.this, PedidoActivity.class  );

        startActivity(intent2);


    }

    public void btnRegistroActivityClick(View view){

        Intent intent  = new Intent (MenuActivity.this, UsuarioActivity.class  );

        startActivity(intent);


    }
}
