package com.example.helloworld.entities;

public class Anime {


    public String id;
    public String nombre;
    public String descripcion;
    public String imagen;
    public String created_at;
    public String updated_at;





    public Anime(String id, String nombre, String descripcion, String imagen, String created_at, String updated_at) {

        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.created_at = created_at;
        this.updated_at = updated_at;

    }
}
