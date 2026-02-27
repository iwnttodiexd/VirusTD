package com.example.virustdserver.entities.player;

import com.example.virustdserver.entities.Level;
import com.example.virustdserver.entities.results.Result;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(
        name = "progress",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"player_id", "level_id"}
                )
        }
)
public class PlayerLevelProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;
    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level level;
    private boolean completed;
    private Integer totalAttempts;
    private LocalDateTime firstCompletedAt;
    private LocalDateTime lastPlayedAt;

}
