package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.helloworld.entities.Pokemons;
import com.example.helloworld.entities.Tareas;
import com.example.helloworld.services.PokemonService;
import com.example.helloworld.services.TareaSevice;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        EditText etnombre = findViewById(R.id.etNombre);
        EditText ettipo = findViewById(R.id.etTipo);
        EditText etimagen = findViewById(R.id.etImagen);
        EditText etlatitude = findViewById(R.id.etLatitude);
        EditText etlongitude = findViewById(R.id.etlongitude);

        Button btnCrear = findViewById(R.id.tncrear);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombre = etnombre.getText().toString();
                String tipo = ettipo.getText().toString();
                String imagen = etimagen.getText().toString();
                String latitude = etlatitude.getText().toString();
                String longitude = etlongitude.getText().toString();


                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://upn.lumenes.tk/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                PokemonService service = retrofit.create(PokemonService.class);

                Pokemons pokemons = new Pokemons();
                pokemons.setNombre(nombre);
                pokemons.setTipo(tipo);
                pokemons.setImagen(imagen);
                pokemons.setLatitude(latitude);
                pokemons.setLongitude(longitude);

                Call<Pokemons> call = service.create(pokemons);

                call.enqueue(new Callback<Pokemons>() {
                    @Override
                    public void onResponse(Call<Pokemons> call, Response<Pokemons> response) {

                    }

                    @Override
                    public void onFailure(Call<Pokemons> call, Throwable t) {

                    }
                });


            }
        });





    }
}