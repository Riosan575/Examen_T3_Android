package com.example.helloworld.services;

import com.example.helloworld.entities.Pokemons;
import com.example.helloworld.entities.Tareas;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PokemonService {
    @GET("pokemons/N00039379")
    Call<List<Pokemons>> getAll();

    @POST("pokemons/N00039379/crear")
    Call<Pokemons> create(@Body Pokemons pokemons);
}
