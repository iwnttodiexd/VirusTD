//package com.example.virustdserver.repository.tests;
//
//import com.example.virustdserver.entities.user.User;
//import com.example.virustdserver.entities.player.Player;
//import com.example.virustdserver.repositories.PlayerRepository;
//import com.example.virustdserver.repositories.UserRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//import java.time.LocalDateTime;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@DataJpaTest
//public class RepositoryTests {
//
//    private final PlayerRepository playerRepository;
//    private final UserRepository userRepository;
//
//    @Autowired
//    public RepositoryTests(PlayerRepository playerRepository, UserRepository userRepository) {
//        this.playerRepository = playerRepository;
//        this.userRepository = userRepository;
//    }
//
//    @Test
//    void testThatUserAndPlayerRepositorySaveData() {
//        User user = User.builder()
//                .username("debil")
//                .password("123123")
//                .enabled(false)
//                .isLocked(false)
//                .token("123-123-123")
//                .build();
//
//        userRepository.saveAndFlush(user);
//
//        Player player = Player.builder()
//                .user(user)
//                .nickname("2312312edfsef")
//                .createdAt(LocalDateTime.now())
//                .enemyKilled(12123312L)
//                .settings("graphic: quality")
//                .build();
//
//        playerRepository.saveAndFlush(player);
//
//        assertThat(userRepository.existsById(user.getId())).isTrue();
//
//        assertThat(playerRepository.existsById(player.getId())).isTrue();
//
//
//    }
//}
