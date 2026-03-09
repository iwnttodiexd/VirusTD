package com.example.virustdserver.services;

import com.example.virustdserver.dto.RegisterRequest;
import com.example.virustdserver.dto.auth.AuthenticationRequest;
import com.example.virustdserver.dto.auth.AuthenticationResponse;
import com.example.virustdserver.entities.user.User;
import com.example.virustdserver.jwt.JwtService;
import com.example.virustdserver.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final JwtService jwtService;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register(RegisterRequest request){
        var user = User.builder()
                .username(request.username())
                .password(passwordEncoder.encode(request.password()))
                .userRoles()
                .build();

        userRepository.save(user);

        return AuthenticationResponse.builder()
                .token(jwtService.generateToken(user))
                .build();

    }

    public AuthenticationResponse authenticate(
            AuthenticationRequest request
    ) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.username(),
                        request.password()
                )
        );

        var user = userRepository.findByUsername(request.username())
                .orElseThrow(
                        () -> new UsernameNotFoundException("User was not found")
                );

        return AuthenticationResponse.builder()
                .token(jwtService.generateToken(user))
                .build();

    }

}
