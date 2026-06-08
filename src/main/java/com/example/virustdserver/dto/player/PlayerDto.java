package com.example.virustdserver.dto.player;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record PlayerDto (
    @NotNull String nickname,
    @NotNull Long enemyKilled,
    @NotBlank String settings
){
}
