package com.example.virustdserver.entities.player;

import com.example.virustdserver.entities.Achievement;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(
        name = "player_achievements",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"player_id" ,"achievement_id"})
        }
)
public class PlayerAchievements {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    private Player player;
    @ManyToOne
    @JoinColumn(name = "achievement_id")
    private Achievement achievement;
    @CreationTimestamp
    private LocalDateTime dateUnlocked;
}
