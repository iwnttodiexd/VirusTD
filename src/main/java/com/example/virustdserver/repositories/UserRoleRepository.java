package com.example.virustdserver.repositories;

import com.example.virustdserver.entities.user.User;
import com.example.virustdserver.entities.user.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, UUID> {

    Optional<List<UserRole>> findAllByUser(User user);
}
