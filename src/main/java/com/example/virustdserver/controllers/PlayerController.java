package com.example.virustdserver.controllers;

import com.example.virustdserver.dto.player.CreatePlayerRequest;
import com.example.virustdserver.dto.player.PartablePlayerUpdateRequest;
import com.example.virustdserver.dto.player.PlayerDto;
import com.example.virustdserver.entities.player.Player;
import com.example.virustdserver.entities.user.User;
import com.example.virustdserver.mappers.impl.PlayerMapper;
import com.example.virustdserver.services.PlayerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController("/api/v1/player")
@RequiredArgsConstructor
public class PlayerController {

    private final PlayerMapper playerMapper;
    private final PlayerService playerService;

    @PostMapping("/create")
    public ResponseEntity<?> createPlayer(
            @RequestBody CreatePlayerRequest request,
            @AuthenticationPrincipal User user
    ){
        Player playerEntity = playerService.createPlayer(request, user);
        PlayerDto playerDto = playerMapper.mapToDto(playerEntity);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(playerDto);
    }

    @GetMapping
    public ResponseEntity<?> getAllPlayers(){
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPlayerById(
            @PathVariable UUID id
    ){
        Player player = playerService.getPlayerById(id);

        return ResponseEntity.ok(
                playerMapper.mapToDto(player)
        );
    }

    @GetMapping("/{nickname}")
    public ResponseEntity<?> getPlayerByNickname(
            @PathVariable String nickname,
            @AuthenticationPrincipal User user
    ){
        Player player = playerService.getPlayerByNickname(nickname);

        return ResponseEntity.ok(
                playerMapper.mapToDto(player)
        );
    }

    @PatchMapping("/patch/{id}")
    public ResponseEntity<?> partablePlayerUpdate(
            @RequestBody PartablePlayerUpdateRequest request,
            @PathVariable UUID id
    ){
        return null;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updatePlayer(
            @RequestBody @Valid PlayerDto player,
            @PathVariable UUID id
    ){
        return null;
    }
}
