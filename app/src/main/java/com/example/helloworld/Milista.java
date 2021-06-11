package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.helloworld.adapters.AnimeAdapter;
import com.example.helloworld.adapters.PokemonAdapter;
import com.example.helloworld.adapters.TareaAdapter;
import com.example.helloworld.entities.Anime;
import com.example.helloworld.entities.Pokemons;
import com.example.helloworld.entities.Tareas;
import com.example.helloworld.services.ContacService;
import com.example.helloworld.services.PokemonService;
import com.example.helloworld.services.TareaSevice;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Milista extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milista);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://upn.lumenes.tk/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();



        PokemonService service = retrofit.create(PokemonService.class);
        Call<List<Pokemons>> pokemonCall =  service.getAll();

        pokemonCall.enqueue(new Callback<List<Pokemons>>() {
            @Override
            public void onResponse(Call<List<Pokemons>> call, Response<List<Pokemons>> response) {
                List<Pokemons> pokemons = response.body();

                RecyclerView rv = findViewById(R.id.rvPalabras);

                rv.setLayoutManager(new LinearLayoutManager(Milista.this));

                PokemonAdapter adapter = new PokemonAdapter(pokemons);

                adapter.setOnclickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Milista.this,DetalleActivity.class);
                        String pokemon = new Gson().toJson(pokemons.get(rv.getChildAdapterPosition(v)));
                        intent.putExtra("pokemon", pokemon);
                        startActivity(intent);
                    }
                });

                rv.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Pokemons>> call, Throwable t) {

            }
        });


    }

    /*public List<Anime> GetAnime(){

        List<Anime> animes = new ArrayList<>();

        animes.add(new Anime("Fairy Tail","Fairy Tail es un manga de aventura y fantasía escrito e ilustrado por Hiro Mashima, publicado por primera vez el 23 de agosto de 2006 en la revista Shōnen Magazine, de la editorial japonesa Kōdansha"));
        animes.add(new Anime("One Piece","One Piece es un anime y manga escrito e ilustrado por Eiichirō Oda y actualmente es el manga más comprado en el mundo."));
        animes.add(new Anime("Naruto","NARUTO, es una serie de manga escrita e ilustrada por Masashi Kishimoto. La obra narra la historia de un ninja adolescente llamado Naruto Uzumaki, quien aspira a convertirse en Hokage"));
        animes.add(new Anime("Tokio Ghoul","Tokyo Ghoul es una serie de manga japonesa de fantasía oscura escrita e ilustrada por Sui Ishida."));
        animes.add(new Anime("Black Clover","Black Clover es una serie de manga japonesa escrita e ilustrada por Yūki Tabata"));


        return animes;
    }*/


    public List<String> GetPalabras()
    {
        List<String> palabras = new ArrayList<>();
        palabras.add("Palabra 1");
        palabras.add("Palabra 2");
        palabras.add("Palabra 3");
        palabras.add("Palabra 4");
        palabras.add("Palabra 5");
        palabras.add("Palabra 6");
        palabras.add("Palabra 7");
        palabras.add("Palabra 8");

        return  palabras;
    }
}