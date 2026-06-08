package com.example.virustdserver.services;

import com.example.virustdserver.dto.player.CreatePlayerRequest;
import com.example.virustdserver.entities.player.Player;
import com.example.virustdserver.entities.user.User;
import com.example.virustdserver.repositories.PlayerRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
@RequiredArgsConstructor
public class PlayerService {

    private final PlayerRepository playerRepository;

    public Player createPlayer(
            @Valid CreatePlayerRequest request,
            @Valid User user
    ){
        var player = Player.builder()
                .nickname(request.nickname())
                .user(user)
                .enemyKilled(0L)
                .settings(" ")
                .build();
        return playerRepository.save(player);
    }

    public Player getPlayerByNickname(String nickname) {
        return playerRepository.getPlayerByNickname(nickname);
    }

    public Player getPlayerById(UUID id) {
        return playerRepository.getPlayerById(id);
    }
}
