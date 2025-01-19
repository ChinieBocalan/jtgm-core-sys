package org.jtgm.sys.repository.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.HealthCheckDTO;
import org.jtgm.sys.repository.MgroupRepository;
import org.jtgm.sys.repository.entity.healthcheck.HealtchCheckEntity;
import org.jtgm.sys.repository.entity.mgroup.MGroupEntity;
import org.jtgm.sys.repository.exception.GenericRepositoryErrorException;
import org.jtgm.sys.repository.jpa.HealthCheckJpa;
import org.jtgm.sys.repository.jpa.MgroupServiceJpa;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class MgroupRepositoryImpl implements MgroupRepository {

    final private MgroupServiceJpa mgroupServiceJpa;

    @Override
    public HealtchCheckEntity update(HealthCheckDTO healthCheckDTO) {
        HealtchCheckEntity healtchCheckEntity = new HealtchCheckEntity().builder()
                .sysName(healthCheckDTO.getSysName())
                .sysDesc(healthCheckDTO.getSysDesc())
                .version(healthCheckDTO.getVersion())
                .date(LocalDateTime.now())
                .isActive(1)
                .build();

        return healthCheckJpa.save(healtchCheckEntity);
    }
}
