package com.example.virustdserver.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PlayerLevelProgress {

    @Id
    private Long sessionId;
    private Integer enemiesKilled;
    private Integer towersCreated;

}
