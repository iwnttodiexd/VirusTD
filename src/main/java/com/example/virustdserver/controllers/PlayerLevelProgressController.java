package com.example.virustdserver.controllers;

import com.example.virustdserver.dto.PlayerLevelProgressDto;
import com.example.virustdserver.entities.player.PlayerLevelProgress;
import com.example.virustdserver.entities.user.User;
import com.example.virustdserver.mappers.impl.PlayerLevelProgressMapper;
import com.example.virustdserver.services.PlayerLevelProgressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController("/api/v1/progress")
@RequiredArgsConstructor
public class PlayerLevelProgressController {

    private final PlayerLevelProgressMapper playerLevelProgressMapper;
    private final PlayerLevelProgressService playerLevelProgressService;

    @PostMapping("/{playerId}/{levelId}")
    public ResponseEntity<?> createProgress(
            @PathVariable UUID playerId,
            @PathVariable UUID levelId,
            @RequestBody PlayerLevelProgressDto dto,
            @AuthenticationPrincipal User user
    ){
        PlayerLevelProgress playerLevelProgress = playerLevelProgressMapper.mapFromDto(dto);
        playerLevelProgressService.put(playerLevelProgress);
        PlayerLevelProgressDto playerLevelProgressDto = playerLevelProgressMapper.mapToDto(playerLevelProgress);
        return ResponseEntity.ok(
                playerLevelProgressDto
        );
    }
}
