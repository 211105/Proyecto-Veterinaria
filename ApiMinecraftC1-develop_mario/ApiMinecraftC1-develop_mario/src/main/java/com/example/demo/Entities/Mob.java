package com.example.demo.Entities;

import javax.persistence.*;

@Entity
@Table(name = "mob")
public class Mob {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column
    private String name;

    @Column
    private String nature;

    @Column
    private float damage;
    public Mob() {}

    public Mob(int id, String name, String nature, float damage) {
        this.id = id;
        this.name = name;
        this.nature = nature;
        this.damage = damage;
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

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

}
