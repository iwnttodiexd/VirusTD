package com.example.virustdserver.entities.towers;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Tower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer baseDamage;
    private Float baseAttackSpeed;
    private Float range;
    private Integer baseCost;
    @OneToMany(mappedBy = "tower")
    private List<TowerUpgrade> towerUpgradeList;

}
