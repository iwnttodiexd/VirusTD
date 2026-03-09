package com.example.virustdserver.entities;

import com.example.virustdserver.complexity.EnemyComplexity;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "enemies")
public class Enemy {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "name", unique = true)
    private String name;
    private Integer totalHealth;
    private Float speed;
    private Integer reward;
    private String description;

}
