package com.example.virustdserver.mappers.impl;

import com.example.virustdserver.dto.UserDto;
import com.example.virustdserver.entities.user.User;
import com.example.virustdserver.mappers.MapperInterface;

public class UserMapper implements MapperInterface<User, UserDto> {


    @Override
    public User mapTo(UserDto dto) {
        return null;
    }

    @Override
    public UserDto mapFrom(User entity) {
        return null;
    }
}
