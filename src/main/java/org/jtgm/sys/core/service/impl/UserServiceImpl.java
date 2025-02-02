package org.jtgm.sys.core.service.impl;

import lombok.RequiredArgsConstructor;
import org.jtgm.sys.core.dto.HealthCheckDTO;
import org.jtgm.sys.core.dto.UserDTO;
import org.jtgm.sys.core.service.HealthCheckService;
import org.jtgm.sys.core.service.UserService;
import org.jtgm.sys.repository.HealthCheckRepository;
import org.jtgm.sys.repository.UserRepository;
import org.jtgm.sys.repository.entity.healthcheck.HealtchCheckEntity;
import org.jtgm.sys.repository.entity.healthcheck.UserEntity;
import org.jtgm.sys.repository.jpa.HealthCheckJpa;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final private UserRepository userRepository;

    @Override
    public List<UserDTO> getUserDetails() {
        List<UserEntity> userEntityList = userRepository.getUserDetails();
        List<UserDTO> userDTOList= userEntityList
                .stream()
                        .map(f -> UserDTO.builder()
                        .id(f.getId())
                        .userName(f.getUserName())
                        .passWord(f.getPassWord())
                        .createdDate(f.getCreatedDate())
                        .updatedDate(f.getUpdatedDate())
                        .build()).toList();

        return userDTOList;
    }
}
