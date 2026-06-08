package com.example.virustdserver.repositories;

import com.example.virustdserver.entities.player.PlayerLevelProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlayerLevelProgressRepository extends JpaRepository<PlayerLevelProgress, UUID> {
}
