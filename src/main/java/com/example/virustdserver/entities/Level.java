package com.example.virustdserver.entities;

import com.example.virustdserver.entities.complexity.LevelComplexity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "levels")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Level {

    @Id
    @Column(name = "title", unique = true)
    private String title;
    private String description;
    private LevelComplexity complexity;
}
