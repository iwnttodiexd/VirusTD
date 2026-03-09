package com.example.virustdserver.controllers;

import com.example.virustdserver.dto.RegisterRequest;
import com.example.virustdserver.dto.auth.AuthenticationRequest;
import com.example.virustdserver.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(
            @RequestBody RegisterRequest request
    ){
        return ResponseEntity.ok(
                authenticationService.register(request)
        );
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticate(
            @RequestBody AuthenticationRequest request
            ){
        return ResponseEntity.ok(
                authenticationService.authenticate(request)
        );
    }

}
