package org.jtgm.sys.core.service.impl;

import lombok.RequiredArgsConstructor;
import org.jtgm.sys.core.dto.HealthCheckDTO;
import org.jtgm.sys.core.dto.MGroupDTO;
import org.jtgm.sys.core.service.HealthCheckService;
import org.jtgm.sys.core.service.MGroupService;
import org.jtgm.sys.repository.HealthCheckRepository;
import org.jtgm.sys.repository.MGroupRepository;
import org.jtgm.sys.repository.entity.healthcheck.HealtchCheckEntity;
import org.jtgm.sys.repository.entity.healthcheck.MGroupEntity;
import org.jtgm.sys.repository.jpa.HealthCheckJpa;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

@Service
@RequiredArgsConstructor
public class MGroupServiceImpl implements MGroupService {

    final private HealthCheckRepository healthCheckRepository;
    private MGroupRepository mGroupRepository;

    @Override
    public MGroupDTO update(MGroupDTO mGroupDTO) {
        MGroupEntity mGroupProcessed = mGroupRepository.update(mGroupDTO);
        return builderMGroupDTO(mGroupProcessed);
    }

    private MGroupDTO builderMGroupDTO(MGroupEntity mGroupEntity) {
        return MGroupDTO.builder().build()
                .id(mGroupEntity.getId())
                .name(mGroupEntity.getName())
                .description(mGroupEntity.getDescription())
                .category(mGroupEntity.getCategory())
                .location(mGroupEntity.getLocation())
                .leader(mGroupEntity.getLeader())
                .created_Date(mGroupEntity.getCreated_Date() == null ? LocalDateTime.now() : mGroupEntity.getCreated_Date())
                .updated_Date(mGroupEntity.getUpdated_Date()) == null? LocalDateTime.now() : mGroupEntity.getUpdated_Date())
                .build();
        return build;
    }

}
