package org.jtgm.sys.repository;

import org.jtgm.sys.core.dto.HealthCheckDTO;
import org.jtgm.sys.repository.entity.healthcheck.HealtchCheckEntity;

public interface HealthCheckRepository {
    HealtchCheckEntity getHealthCheckDetails();
    HealtchCheckEntity update(HealthCheckDTO healthCheckDTO);
}
