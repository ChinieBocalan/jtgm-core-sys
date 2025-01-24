package org.jtgm.sys.repository;

import org.jtgm.sys.core.dto.HealthCheckDTO;
import org.jtgm.sys.core.dto.UserDTO;
import org.jtgm.sys.repository.entity.healthcheck.HealtchCheckEntity;
import org.jtgm.sys.repository.entity.user.UserEntity;

public interface HealthCheckRepository {
    HealtchCheckEntity getHealthCheckDetails();

    HealtchCheckEntity update(HealthCheckDTO healthCheckDTO);

}