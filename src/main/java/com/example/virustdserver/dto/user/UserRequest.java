package com.example.virustdserver.dto.user;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public record UserRequest(
        @NotNull UUID id,
        @NotNull String username,
        @NotNull @Size(min = 8) String password
        ) {
}
