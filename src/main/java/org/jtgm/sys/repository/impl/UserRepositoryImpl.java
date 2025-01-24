package org.jtgm.sys.repository.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.UserDTO;
import org.jtgm.sys.repository.HealthCheckRepository;
import org.jtgm.sys.repository.UserRepository;
import org.jtgm.sys.repository.entity.user.UserEntity;
import org.jtgm.sys.repository.jpa.UserJpa;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
@RequiredArgsConstructor
@Slf4j
public class UserRepositoryImpl implements UserRepository {
    final private UserJpa userJpa;
    @Override
    public UserEntity update(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity().builder()
                .username(userDTO.getUsername())
                .password(userDTO.getPassword())
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();

        return userJpa.save(userEntity);
    }
}
