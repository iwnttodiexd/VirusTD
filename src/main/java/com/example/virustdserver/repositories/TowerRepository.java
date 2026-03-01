package com.example.virustdserver.repositories;

import com.example.virustdserver.entities.towers.Tower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TowerRepository extends JpaRepository<Tower, Integer> {
}
