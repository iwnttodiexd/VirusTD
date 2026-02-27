package com.example.virustdserver.entities.results;

import com.example.virustdserver.entities.Level;
import com.example.virustdserver.entities.player.Player;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GameResults {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;
    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level level;
    private Integer enemiesKilled;
    private Integer towersBuilt;
    private Result result;
    @CreationTimestamp
    private LocalDateTime playedAt;

}
