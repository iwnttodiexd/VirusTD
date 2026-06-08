package com.example.virustdserver.mappers.impl;

import com.example.virustdserver.dto.RoleDto;
import com.example.virustdserver.entities.user.Role;
import com.example.virustdserver.mappers.MapperInterface;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper extends MapperInterface<Role, RoleDto> {

}
