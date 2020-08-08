package com.example.cocinerosapp.ui.pedido;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.cocinerosapp.data.modelo.Pedido;
import com.example.cocinerosapp.ui.MenuActivity;
import com.example.cocinerosapp.R;

public class PedidoActivity extends AppCompatActivity implements PedidoRecyclerAdapter.OnItemClickListener {

    private PedidoViewModel pedidoViewModel;
    private PedidoRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);
        RecyclerView pedidos = findViewById(R.id.pedidoList);
        pedidos.setLayoutManager(new LinearLayoutManager(this));
        adapter = new PedidoRecyclerAdapter(this);
        pedidos.setAdapter(adapter);
        pedidoViewModel = new ViewModelProvider(this).get(PedidoViewModel.class);
        pedidoViewModel.obtenerPedidos();
        observableViewModel();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Pedidos");
    }
        private void observableViewModel() {
            pedidoViewModel.getPedidos().observe(this, pedidos -> {
                if (pedidos != null) {
                    adapter.updateItems(pedidos);
                }
            });

            pedidoViewModel.getError().observe(this, error -> {
                if (error != null) {
                    Toast.makeText(this, error.getMensaje(), Toast.LENGTH_SHORT).show();
                }
            });
        }


        @Override
        public void onItemClick(Pedido pedido, int position) {
            openDialog();
        }


        public void btnEntregarPedidoClick(View view){

            Intent intent1  = new Intent (PedidoActivity.this, MenuActivity.class  );

            startActivity(intent1);


        }

        public void openDialog() {
            DialogPedidoActivity dialogPedido = new DialogPedidoActivity();
            dialogPedido.show(getSupportFragmentManager(), "Pedido");
        }
}
