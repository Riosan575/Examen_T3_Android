package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.helloworld.adapters.PokemonAdapter;
import com.example.helloworld.entities.Pokemons;
import com.example.helloworld.services.PokemonService;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);


        ImageView imagen = findViewById(R.id.tvImagenPoke);
        TextView tvnombre = findViewById(R.id.tvNombrePoke);
        TextView tvtipo = findViewById(R.id.tvtipoPoke);

        Intent intent = getIntent();
        String pokemon = intent.getStringExtra("pokemon");
        Pokemons pokemons = new Gson().fromJson(pokemon,Pokemons.class);

        tvnombre.setText(pokemons.getNombre());
        tvtipo.setText(pokemons.getTipo());
        Picasso.get().load(pokemons.getImagen()).into(imagen);


    }
}