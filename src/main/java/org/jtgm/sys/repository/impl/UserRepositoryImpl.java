package org.jtgm.sys.repository.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.UserDTO;
import org.jtgm.sys.repository.UserRepository;
import org.jtgm.sys.repository.entity.healthcheck.UserEntity;
import org.jtgm.sys.repository.exception.GenericRepositoryErrorException;
import org.jtgm.sys.repository.jpa.UserJPA;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class UserRepositoryImpl implements UserRepository {
    final private UserJPA userJpa;

    @Override
    public UserEntity update (UserDTO userDTO) {
        UserEntity userEntity = new UserEntity().builder()
        .id(userDTO.getId())
        .username(userDTO.getUsername())
        .password(userDTO.getPassword())
        .createdDate(LocalDateTime.now())
        .updatedDate(LocalDateTime.now())
        .build();

        return userJpa.save(userEntity);
    }

    @Override
    public List<UserEntity> getUserDetails() {
        try {
            log.info("[INFO] Retrieving details from database");
            List<UserEntity> userEntity = userJpa.findAll();
            log.info("[INFO] Retrieving details from database");
            return userEntity;
        }catch (Exception e){
            throw new GenericRepositoryErrorException("[ERROR] Failed to retrieve details", e);
        }
}
