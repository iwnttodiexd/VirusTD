package com.example.virustdserver.controllers;

import com.example.virustdserver.dto.RoleDto;
import com.example.virustdserver.mappers.impl.RoleMapper;
import com.example.virustdserver.services.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/roles")
@RequiredArgsConstructor
public class RolesController {

    private final RoleMapper roleMapper;
    private final RoleService roleService;

    @PostMapping("/add")
    public ResponseEntity<?> addRole(
            @RequestBody RoleDto roleDto
    ){
        var role = roleService.addRole(roleDto);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(roleMapper.mapToDto(role));


    }
}
