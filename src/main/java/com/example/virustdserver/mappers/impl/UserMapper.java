package com.example.virustdserver.mappers.impl;

import com.example.virustdserver.dto.user.UserRequest;
import com.example.virustdserver.entities.user.User;
import com.example.virustdserver.mappers.MapperInterface;

public class UserMapper implements MapperInterface<User, UserRequest> {


    @Override
    public User mapTo(UserRequest dto) {
        return null;
    }

    @Override
    public UserRequest mapFrom(User entity) {
        return null;
    }
}
