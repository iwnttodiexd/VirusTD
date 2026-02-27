package com.example.virustdserver.entities;

import com.example.virustdserver.complexity.EnemyComplexity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Enemy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer totalHealth;
    private Float damage;
    private Integer reward;
    private Float speed;
    private EnemyComplexity complexity;
    private String description;

}
