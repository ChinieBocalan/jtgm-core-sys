package org.jtgm.sys.core.service.impl;

import lombok.RequiredArgsConstructor;
import org.jtgm.sys.core.dto.UserDTO;
import org.jtgm.sys.repository.entity.user.UserEntity;
import org.jtgm.sys.repository.jpa.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    final private UserRepository userRepository;

    @Override
    public UserDTO update(UserDTO userDTO) {
        UserEntity userProcessed =  userRepository.update(userDTO);
        return builderUserDTO(userProcessed);
    }

    private UserDTO builderUserDTO(UserEntity userEntity){
        return UserDTO.builder()
                .id(userEntity.getId())
                .username(userEntity.getUsername())
                .password(userEntity.getPassword())
                .createdDate(userEntity.getCreatedDate() == null ? LocalDateTime.now() : userEntity.getCreatedDate())
                .updatedDate(userEntity.getUpdatedDate() == null ? LocalDateTime.now() : userEntity.getUpdatedDate())
                .build();
    }

}
