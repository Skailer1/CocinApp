package com.example.cocinerosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DialogPedidoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_pedido);

        Intent intent = getIntent();
        String val = intent.getStringExtra("detalle");

        TextView textView= (TextView) findViewById(R.id.DialogDetailId);
        textView.setText(val);
    }
}
