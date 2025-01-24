package org.jtgm.sys.core.service.impl;

import lombok.RequiredArgsConstructor;
import org.jtgm.sys.core.dto.UserDTO;
import org.jtgm.sys.core.service.UserService;
import org.jtgm.sys.repository.HealthCheckRepository;
import org.jtgm.sys.repository.UserRepository;
import org.jtgm.sys.repository.entity.user.UserEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public abstract class UserServiceImpl implements UserService {

    final private UserRepository userRepository;

    @Override
    public UserDTO update(UserDTO userDTO) {
        UserEntity userProcessed =  userRepository.update(userDTO);
        return builderUserDTO(userProcessed);
    }

    private UserDTO buildUserDTO(UserEntity userEntity) {
        return UserDTO.builder()
                .id(userEntity.getId())
                .username(userEntity.getUsername())
                .password(null)
                .createdDate(userEntity.getCreatedDate() != null ? userEntity.getCreatedDate() : LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();
    }

}
