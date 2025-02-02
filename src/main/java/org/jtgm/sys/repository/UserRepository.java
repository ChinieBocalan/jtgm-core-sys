package org.jtgm.sys.repository;

import org.jtgm.sys.core.dto.HealthCheckDTO;
import org.jtgm.sys.repository.entity.healthcheck.HealtchCheckEntity;
import org.jtgm.sys.repository.entity.healthcheck.UserEntity;

import java.util.List;

public interface UserRepository {
    List<UserEntity> getUserDetails();
}
