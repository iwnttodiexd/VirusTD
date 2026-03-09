package com.example.virustdserver.entities.towers;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "abilities")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ability {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String description;
}
