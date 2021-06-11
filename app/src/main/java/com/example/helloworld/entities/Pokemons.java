package com.example.helloworld.entities;

public class Pokemons {

    public String nombre;
    public String tipo;
    public String url_imagen;
    public String latitude;
    public String longitude;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getImagen() {
        return url_imagen;
    }

    public void setImagen(String imagen) {
        this.url_imagen = imagen;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
