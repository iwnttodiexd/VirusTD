package com.example.virustdserver.dto.auth;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record AuthenticationRequest(
        @NotNull String username,
        @NotNull @Size(min = 8) String password
) {
}
