package com.example.virustdserver.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Achievement {

    @Id
    private Integer id;
    private String name;
    private String description;

}
