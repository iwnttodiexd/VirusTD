package com.example.virustdserver.dto;

import jakarta.validation.Valid;

import java.time.LocalDateTime;
import java.util.UUID;

public record PlayerLevelProgressDto(
    @Valid UUID playerId,
    @Valid UUID levelId,
    @Valid boolean completed,
    @Valid Integer totalAttempts,
    @Valid LocalDateTime firstCompletedAt,
    @Valid LocalDateTime lastPlayedAt
) {
}
