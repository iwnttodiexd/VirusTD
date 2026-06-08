package com.example.virustdserver.services;

import com.example.virustdserver.dto.PlayerLevelProgressDto;
import com.example.virustdserver.entities.player.PlayerLevelProgress;
import com.example.virustdserver.repositories.PlayerLevelProgressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayerLevelProgressService {

    private final PlayerLevelProgressRepository playerLevelProgressRepository;

    public PlayerLevelProgressDto put(PlayerLevelProgress playerLevelProgress) {
        playerLevelProgressRepository.save(playerLevelProgress);
    }
}
