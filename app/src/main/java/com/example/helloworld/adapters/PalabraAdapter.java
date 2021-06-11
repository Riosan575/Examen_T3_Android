package com.example.helloworld.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloworld.R;

import java.util.List;

public class PalabraAdapter extends RecyclerView.Adapter<PalabraAdapter.PalabraViewHolder> {

    List<String> palabras;

    public PalabraAdapter(List<String> palabras) {

        this.palabras = palabras;
    }

    @Override
    public PalabraViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itempalabra,parent,false);



        return new PalabraViewHolder(view);
    }

    @Override
    public void onBindViewHolder( PalabraAdapter.PalabraViewHolder holder, int position) {

        View view = holder.itemView;

        TextView tvPalabra = view.findViewById(R.id.tvPalabra);

        String palabra = palabras.get(position);

        tvPalabra.setText(palabra);
    }

    @Override
    public int getItemCount() {
        return palabras.size();
    }

    public  class PalabraViewHolder extends RecyclerView.ViewHolder {

        public PalabraViewHolder(View itemView) {
            super(itemView);
        }
    }

}
