package com.example.virustdserver.entities.player;

import com.example.virustdserver.entities.Achievement;
import com.example.virustdserver.entities.Level;
import com.example.virustdserver.entities.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "players")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Player {

    @Id
    @OneToOne
    private User user;
    @Size(min = 4, max = 22)
    @Column(unique = true, name = "nickname")
    private String nickname;
    private Long enemyKilled;
    private List<Level> levelsDone;
    private List<Achievement> achievements;
    private String settings;
    @CreatedDate
    private LocalDateTime createdAt;

}
