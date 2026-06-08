package com.example.virustdserver.services;

import com.example.virustdserver.dto.RoleDto;
import com.example.virustdserver.entities.user.Role;
import com.example.virustdserver.repositories.RoleRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    public Role addRole(
            @Valid RoleDto roleDto
    ){
        Role role = Role.builder()
                .name(roleDto.name())
                .build();

        return roleRepository.save(role);
    }
}
