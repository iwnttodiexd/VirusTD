package com.example.virustdserver;

import com.example.virustdserver.entities.user.Role;
import com.example.virustdserver.repositories.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RoleInitializer implements CommandLineRunner {

    private final RoleRepository roleRepository;

    @Override
    public void run(String... args) {

        if (roleRepository.findRoleByName("USER").isEmpty()) {
            roleRepository.save(
                    Role.builder()
                            .name("USER")
                            .build()
            );
        }

        if (roleRepository.findRoleByName("ADMIN").isEmpty()) {
            roleRepository.save(
                    Role.builder()
                            .name("ADMIN")
                            .build()
            );
        }
    }
}
