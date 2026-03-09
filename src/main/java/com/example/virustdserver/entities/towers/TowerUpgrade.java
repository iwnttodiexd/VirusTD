package com.example.virustdserver.entities.towers;

import com.example.virustdserver.entities.results.Result;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tower_upgrades")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TowerUpgrade {

    @Id
    private UUID id;
    @Setter
    @Getter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tower_id")
    private Tower tower;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tower_abilities_id")
    private TowerAbility towerAbility;
    private Integer damageIncreased;
    private Float attackSpeedIncreased;
    private Integer cost;
    private String description;

}
