package com.example.helloworld.entities;

public class Tareas {


    public String id;
    public String assigned;
    public String date;
    public String isDone;
    public String description;


    public Tareas(String id, String assigned, String date, String isDone, String descripcion){

        this.id = id;
        this.assigned = assigned;
        this.date = date;
        this.isDone = isDone;
        this.description = descripcion;

    }

}
