package org.jtgm.sys.core.service.impl;

import lombok.*;
import org.jtgm.sys.core.dto.HealthCheckDTO;
import org.jtgm.sys.core.service.HealthCheckService;
import org.jtgm.sys.repository.HealthCheckRepository;
import org.jtgm.sys.repository.entity.healthcheck.HealtchCheckEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

@Service
@RequiredArgsConstructor
public class HealthCheckServiceImpl implements HealthCheckService {

    final private HealthCheckRepository healthCheckRepository;

    @Override
    public HealthCheckDTO getHealtCheckDetails() {
        HealtchCheckEntity healtchCheckEntity = healthCheckRepository.getHealthCheckDetails();
        return builderHealthCheckDTO(healtchCheckEntity);
    }

    @Override
    public HealthCheckDTO update(HealthCheckDTO healthCheckDTO) {
        HealtchCheckEntity healthCheckProcessed =  healthCheckRepository.update(healthCheckDTO);
        return builderHealthCheckDTO(healthCheckProcessed);
    }

    private HealthCheckDTO builderHealthCheckDTO(HealtchCheckEntity healtchCheckEntity){
        return HealthCheckDTO.builder()
                .id(healtchCheckEntity.getId())
                .isActive(healtchCheckEntity.getIsActive() == 0 ? FALSE : TRUE)
                .sysName(healtchCheckEntity.getSysName())
                .date(healtchCheckEntity.getDate() == null ? LocalDateTime.now() : healtchCheckEntity.getDate())
                .version(healtchCheckEntity.getVersion())
                .sysDesc(healtchCheckEntity.getSysDesc())
                .build();
    }
}
