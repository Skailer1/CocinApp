package com.example.cocinerosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Login");
    }

    public void btnLoginIdClick(View view){

        Intent intent1  = new Intent (LoginActivity.this, PedidosActivity.class  );

        startActivity(intent1);


    }
    public void btnRegistroClick(View view){

        Intent intent2  = new Intent (LoginActivity.this, RegistroActivity.class  );

        startActivity(intent2);


    }
}
