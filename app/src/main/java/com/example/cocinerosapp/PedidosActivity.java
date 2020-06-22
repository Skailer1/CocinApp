package com.example.cocinerosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.cocinerosapp.Estructural.Pedido;

public class PedidosActivity extends AppCompatActivity {
    String[] pedidos= {"Mesa1","Mesa2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle("Pedidos");


        ListView listView =(ListView) findViewById(R.id.ListPagoId);

        ListAdapter adapter= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,pedidos);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(PedidosActivity.this,DialogPedidoActivity.class);
                intent.putExtra("detalle",pedidos[position]);
                startActivity(intent);




            }
        });

    }

    public void btnEntregarPedidoClick(View view){

        Intent intent1  = new Intent (PedidosActivity.this, LoginActivity.class  );

        startActivity(intent1);


    }
}
