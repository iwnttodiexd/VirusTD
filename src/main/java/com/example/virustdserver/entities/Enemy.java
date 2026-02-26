package com.example.virustdserver.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Enemy {

    @Id
    private Long id;
    private String name;
    private Float damage;
    private String description;

}
