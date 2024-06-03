package com.example.springboard.repository;

import com.example.springboard.model.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveUser() {
        // given
//        UserEntity user = new UserEntity();
//        user.setUsername("asdf");
//        user.setEmail("asdf@asdf.asdf");
//        System.out.println(user.getId());
        // when
//        userRepository.save(user);

        // then
//        assertNotNull(user.getId(), "User ID는 null이 될 수 있습니다");

    }

}
