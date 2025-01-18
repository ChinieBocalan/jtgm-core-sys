package org.jtgm.sys.core.service.impl;

import lombok.*;
import org.jtgm.sys.core.dto.HealthCheckDTO;
import org.jtgm.sys.core.service.HealthCheckService;
import org.jtgm.sys.repository.HealthCheckRepository;
import org.jtgm.sys.repository.entity.healthcheck.HealtchCheckEntity;
import org.springframework.stereotype.Service;

import static java.lang.Boolean.TRUE;

@Service
@RequiredArgsConstructor
public class HealthCheckServiceImpl implements HealthCheckService {

    final private HealthCheckRepository healthCheckRepository;

    @Override
    public HealthCheckDTO getHealtCheckDetails() {
        HealtchCheckEntity healtchCheckEntity = healthCheckRepository.getHealthCheckDetails();
        return HealthCheckDTO.builder()
                .id(healtchCheckEntity.getId())
                .isActive(TRUE)
                .sysName(healtchCheckEntity.getSysName())
                .date(healtchCheckEntity.getDate())
                .version(healtchCheckEntity.getVersion())
                .build();
    }
}
