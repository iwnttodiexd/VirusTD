package com.example.virustdserver.mappers.impl;

import com.example.virustdserver.dto.player.CreatePlayerRequest;
import com.example.virustdserver.dto.player.PlayerDto;
import com.example.virustdserver.entities.player.Player;
import com.example.virustdserver.mappers.MapperInterface;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlayerMapper extends MapperInterface<Player, PlayerDto> {

    Player mapFromCreateRequest(CreatePlayerRequest request);

}
