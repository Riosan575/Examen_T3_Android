package com.example.helloworld.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.helloworld.R;
import com.example.helloworld.entities.Anime;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.PalabraViewHolder>{

    List<Anime> animes;

    public AnimeAdapter(List<Anime> anime) {

        this.animes = anime;
    }

    @Override
    public PalabraViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemcontact,parent,false);

        return new PalabraViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AnimeAdapter.PalabraViewHolder holder, int position) {

        View view = holder.itemView;
        Anime anime = animes.get(position);

        TextView tvNombre = view.findViewById(R.id.tvNom);
        TextView tvDescripcion = view.findViewById(R.id.tvDescrip);
        TextView tvid = view.findViewById(R.id.tvId);
        TextView tvcreate = view.findViewById(R.id.tvCreate);
        TextView tvupdate = view.findViewById(R.id.tvUpdate);
        ImageView imageView = view.findViewById(R.id.tvImagen);
        tvNombre.setText(anime.nombre);
        tvDescripcion.setText(anime.descripcion);
        tvid.setText(anime.id);
        tvcreate.setText(anime.created_at);
        tvupdate.setText(anime.updated_at);
        Picasso.get().load(anime.imagen).into(imageView);




    }

    @Override
    public int getItemCount() {
        return animes.size();
    }

    public  class PalabraViewHolder extends RecyclerView.ViewHolder {

        public PalabraViewHolder(View itemView) {
            super(itemView);
        }
    }

}
