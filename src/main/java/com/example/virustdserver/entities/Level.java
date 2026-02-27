package com.example.virustdserver.entities;

import com.example.virustdserver.complexity.LevelComplexity;
import com.example.virustdserver.entities.player.PlayerLevelProgress;
import com.example.virustdserver.entities.results.GameResults;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "levels")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Level {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "title", unique = true)
    private String title;
    private String description;
    private LevelComplexity complexity;
}
