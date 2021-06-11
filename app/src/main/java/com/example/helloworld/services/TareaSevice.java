package com.example.helloworld.services;

import com.example.helloworld.entities.Tareas;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TareaSevice {

    @GET("tareas/701212")
    Call<List<Tareas>> getAll();
}
