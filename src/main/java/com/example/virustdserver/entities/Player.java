package com.example.virustdserver.entities;

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
    @GeneratedValue()
    private Long id;
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
