package com.example.virustdserver.repositories;

import com.example.virustdserver.entities.Enemy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnemyRepository extends JpaRepository<Enemy, Integer> {

}
