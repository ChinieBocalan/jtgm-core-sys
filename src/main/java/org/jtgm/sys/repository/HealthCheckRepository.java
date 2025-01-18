package org.jtgm.sys.repository;

import org.jtgm.sys.repository.entity.healthcheck.HealtchCheckEntity;

public interface HealthCheckRepository {
    HealtchCheckEntity getHealthCheckDetails();
}
