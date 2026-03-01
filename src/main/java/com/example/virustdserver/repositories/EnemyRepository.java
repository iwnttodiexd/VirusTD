package com.example.virustdserver.repositories;

import com.example.virustdserver.entities.Enemy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnemyRepository extends JpaRepository<Enemy, Integer> {

}
