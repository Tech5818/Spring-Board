package com.example.springboard.repository;

import com.example.springboard.model.UserEntity;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @AfterEach
    public void reset() {
        userRepository.deleteAll();
    }



    @Test
    @DisplayName("유저 저장 테스트")
    public void testSaveUser() {
        // given
        UserEntity insertUser = userRepository.save(UserEntity.builder().username("asdf").email("asdf@asdf.com").build());

        // then
        assertThat("asdf@asdf.com").isEqualTo(insertUser.getEmail());
        assertThat("asdf").isEqualTo(insertUser.getUsername());
    }

    @Test
    @DisplayName("유저 이름으로 찾기")
    public void findUsername() {
        UserEntity insertUser = userRepository.save(UserEntity.builder().username("asdf").email("asdf@asdf.com").build());

        UserEntity findUser = userRepository.findByUsername("asdf");

        assertThat(insertUser.getUsername()).isEqualTo(findUser.getUsername());
    }


}
