package com.example.helloworld.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.helloworld.R;
import com.example.helloworld.entities.Anime;
import com.example.helloworld.entities.Pokemons;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PalabraViewHolder>
            implements View.OnClickListener {

    List<Pokemons> pokemons;

    private  View.OnClickListener listener;

    public PokemonAdapter(List<Pokemons> pokemons) {

        this.pokemons = pokemons;
    }

    @Override
    public PalabraViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itempokemon,parent,false);

        view.setOnClickListener(this.listener);

        return new PalabraViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PokemonAdapter.PalabraViewHolder holder, int position) {

        View view = holder.itemView;
        Pokemons pokemon = pokemons.get(position);

        ImageView tvimagen = view.findViewById(R.id.tvImagenP);
        TextView tvnombre = view.findViewById(R.id.tvNomP);
        TextView tvtipo = view.findViewById(R.id.tvtipoP);

        Picasso.get().load(pokemon.url_imagen).into(tvimagen);
        tvnombre.setText(pokemon.nombre);
        tvtipo.setText(pokemon.tipo);

    }

    @Override
    public int getItemCount() {
        return pokemons.size();
    }

    public void setOnclickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {



    }

    public  class PalabraViewHolder extends RecyclerView.ViewHolder {

        public PalabraViewHolder(View itemView) {
            super(itemView);
        }
    }

}
