package com.example.virustdserver.entities.player;

import com.example.virustdserver.entities.user.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "players")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "user_id", unique = true, nullable = false)
    private User user;

    @Size(min = 3, max = 22)
    @Column(unique = true, name = "nickname")
    private String nickname;

    private Long enemyKilled;
    private String settings;

    @CreatedDate
    private LocalDateTime createdAt;
    
}
