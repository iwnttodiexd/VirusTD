package com.example.virustdserver.entities.towers;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "towers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Tower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String name;
    private Integer baseDamage;
    private Float baseAttackSpeed;
    private Float range;
    private Integer baseCost;
    @OneToMany(mappedBy = "tower")
    private List<TowerUpgrade> towerUpgradeList;

}
