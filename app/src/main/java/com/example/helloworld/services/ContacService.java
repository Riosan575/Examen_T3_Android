package com.example.helloworld.services;

import com.example.helloworld.entities.Anime;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ContacService {

    @GET("animes")
    Call<List<Anime>> getAll();
}
