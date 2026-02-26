package com.example.virustdserver.entities;

import com.example.virustdserver.entities.complexity.EnemyComplexity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Enemy {

    @Id
    private Long id;
    private String name;
    private Integer totalHealth;
    private Float damage;
    private Integer reward;
    private Float speed;
    private EnemyComplexity complexity;
    private String description;

}
