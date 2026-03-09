package com.example.virustdserver.dto.auth;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record AuthenticationResponse(
        @NotNull String token
) {
}
