package org.jtgm.sys.repository.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.HealthCheckDTO;
import org.jtgm.sys.repository.HealthCheckRepository;
import org.jtgm.sys.repository.entity.healthcheck.HealtchCheckEntity;
import org.jtgm.sys.repository.exception.GenericRepositoryErrorException;
import org.jtgm.sys.repository.jpa.HealthCheckJpa;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class MgroupRepositoryImpl implements MgroupRepository {

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

    @Override
    public HealtchCheckEntity update(HealthCheckDTO healthCheckDTO) {
        HealtchCheckEntity healtchCheckEntity = new HealtchCheckEntity().builder()
                .sysName(healthCheckDTO.getSysName())
                .sysDesc(healthCheckDTO.getSysDesc())
                .version(healthCheckDTO.getVersion())
                .date(LocalDateTime.now())
                .isActive(1)
                .build();

        List<HealtchCheckEntity> healtchCheckEntityList = healthCheckJpa.findAll();
        healtchCheckEntityList
                .stream()
                .map(f -> HealtchCheckEntity.builder()
                        .id(f.getId())
                        .sysName(f.getSysName())
                        .sysDesc(f.getSysDesc())
                        .version(f.getVersion())
                        .date(f.getDate())
                        .isActive(0)
                        .build()
                ).forEach(healthCheckJpa::save);

        return healthCheckJpa.save(healtchCheckEntity);
    }
}
