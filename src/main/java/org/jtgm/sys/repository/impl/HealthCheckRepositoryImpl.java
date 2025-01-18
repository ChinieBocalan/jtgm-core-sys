package org.jtgm.sys.repository.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.repository.HealthCheckRepository;
import org.jtgm.sys.repository.entity.healthcheck.HealtchCheckEntity;
import org.jtgm.sys.repository.exception.GenericRepositoryErrorException;
import org.jtgm.sys.repository.jpa.HealthCheckJpa;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Slf4j
public class HealthCheckRepositoryImpl implements HealthCheckRepository {

    final private HealthCheckJpa healthCheckJpa;

    @Override
    public HealtchCheckEntity getHealthCheckDetails() {
        try {
            log.info("[INFO] Retrieving details from database");
            HealtchCheckEntity healtchCheckEntity = healthCheckJpa.findByIsActive(1).get();
            log.info("[INFO] Retrieving details from database");
            return healtchCheckEntity;
        }catch (Exception e){
            throw new GenericRepositoryErrorException("[ERROR] Failed to retrieve details", e);
        }
    }
}
