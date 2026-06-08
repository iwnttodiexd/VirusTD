package com.example.virustdserver.repositories;

import com.example.virustdserver.entities.results.GameResults;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GameResultsRepository extends JpaRepository<GameResults, UUID> {
}
