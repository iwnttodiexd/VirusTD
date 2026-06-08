package com.example.virustdserver.dto;

import jakarta.validation.Valid;

public record RoleDto(
        @Valid String name
) {
}
