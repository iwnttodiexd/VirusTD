package com.example.virustdserver.entities.towers;

import com.example.virustdserver.entities.results.Result;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TowerUpgrade {

    @Id
    private Integer id;
    @Setter
    @Getter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tower_id")
    private Tower tower;
    private Integer damageIncreased;
    private Integer cost;

}
