package com.example.virustdserver.entities.towers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Tower {

    @Id
    private Integer id;
    private String name;
    private Integer baseDamage;
    private Float baseAttackSpeed;
    private Float range;
    private Integer baseCost;

}
