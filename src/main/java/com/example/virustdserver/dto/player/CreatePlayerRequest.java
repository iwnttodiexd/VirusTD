package com.example.virustdserver.dto.player;

import jakarta.validation.Valid;

public record CreatePlayerRequest (
        @Valid String nickname
){


}
