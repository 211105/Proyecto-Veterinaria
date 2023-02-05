package com.example.demo.Entities;

import javax.persistence.*;
@Entity
@Table(name="Block")
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;
    @Column
    private String gravity;
    @Column
    private String world;
    public Block(){}
    public Block(int id, String name,String gravity, String world) {
        this.id=id;
        this.name=name;
        this.gravity=gravity;
        this.world=world;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }
}