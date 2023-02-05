package com.example.demo.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "stack")
    private String stack;

    @Column(name = "description")
    private String description;

    public Item(int id, String name, String stack, String description){
        this.id = id;
        this.name = name;
        this.stack = stack;
        this.description  = description;
    }

    public Item(){}

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public String getStack(){
        return stack;
    }
    public void setStack(String stack){
        this.stack = stack;
    }


    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
}
