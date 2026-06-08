package com.example.virustdserver.mappers.impl;

import com.example.virustdserver.dto.PlayerLevelProgressDto;
import com.example.virustdserver.entities.player.PlayerLevelProgress;
import com.example.virustdserver.mappers.MapperInterface;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlayerLevelProgressMapper extends
        MapperInterface<PlayerLevelProgress, PlayerLevelProgressDto> {
}
