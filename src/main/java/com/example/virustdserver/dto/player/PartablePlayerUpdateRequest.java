package com.example.virustdserver.dto.player;

public record PartablePlayerUpdateRequest (
        String nickname,
        Long enemyKilled,
        String settings
) {
}
