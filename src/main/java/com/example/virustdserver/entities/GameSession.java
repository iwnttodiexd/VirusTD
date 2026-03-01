package com.example.virustdserver.entities;

import com.example.virustdserver.entities.player.Player;
import com.example.virustdserver.entities.session.Status;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "sessions")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class GameSession {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;
    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level level;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
    @Enumerated(EnumType.STRING)
    private Status status;


}
