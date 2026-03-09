package com.example.virustdserver.entities.towers;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "tower_abilities")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TowerAbility {

    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "tower_id")
    private Tower tower;
    @ManyToOne
    @JoinColumn(name = "ability_id")
    private Ability ability;

    private Float value;
    private Float duration;
    private Float radius;

}
