package com.example.cocinerosapp.ui.pedido;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cocinerosapp.R;
import com.example.cocinerosapp.data.modelo.Pedido;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PedidoRecyclerAdapter extends RecyclerView.Adapter<PedidoRecyclerAdapter.ViewHolder> {

    private List<Pedido> pedidos = new ArrayList<>();
    private final OnItemClickListener onItemClickListener;

    PedidoRecyclerAdapter(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_orderlist_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(pedidos.get(position), position);

    }


    @Override
    public int getItemCount() {
        return pedidos.size();
    }

    void updateItems(List<Pedido> pedidos) {
        this.pedidos.clear();
        this.pedidos.addAll(pedidos);
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtOrderId , txtFechaPedido, txtEmpleado, txtMesa, txtEstado;
        ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtOrderId = itemView.findViewById(R.id.txtOrderId);
            txtFechaPedido = itemView.findViewById(R.id.txtFechaPedido);
            txtMesa = itemView.findViewById(R.id.txtMesa);
            txtEmpleado = itemView.findViewById(R.id.txtEmpleado);
            txtEstado = itemView.findViewById(R.id.txtEstado);
        }

        void bind(Pedido pedido, int position) {
            txtOrderId.setText(String.valueOf(pedido.getId()));
            txtFechaPedido.setText(String.valueOf(pedido.getFechaPedido()));
            txtMesa.setText(pedido.getMesaId().getNombre());
            txtEmpleado.setText(pedido.getEmpleadoId().getNombre());
            txtEstado.setText(pedido.getEstadoId().estado());
            itemView.setOnClickListener(v -> onItemClickListener.onItemClick(pedido, position));
        }
    }

    public interface OnItemClickListener {
        void onItemClick(Pedido pedido, int position);
    }


}
