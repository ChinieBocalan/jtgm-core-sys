package org.jtgm.sys.repository.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.HealthCheckDTO;
import org.jtgm.sys.core.dto.MGroupDTO;
import org.jtgm.sys.repository.HealthCheckRepository;
import org.jtgm.sys.repository.MGroupRepository;
import org.jtgm.sys.repository.entity.healthcheck.HealtchCheckEntity;
import org.jtgm.sys.repository.entity.healthcheck.MGroupEntity;
import org.jtgm.sys.repository.exception.GenericRepositoryErrorException;
import org.jtgm.sys.repository.jpa.HealthCheckJpa;
import org.jtgm.sys.repository.jpa.MGroupJpaImpl;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class MGroupRepositoryImpl implements MGroupRepository {

    final private HealthCheckJpa healthCheckJpa;
    private MGroupJpaImpl mGroupJpa;

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
    public MGroupEntity update(MGroupDTO mGroupDTO) {
        new MGroupEntity();
        MGroupEntity mGroupEntity = MGroupEntity.builder()
                .name(mGroupDTO.getName())
                .description(mGroupDTO.getDescription())
                .category(mGroupDTO.getCategory())
                .location(mGroupDTO.getLocation())
                .leader(mGroupDTO.getLeader())
                .created_Date(LocalDateTime.now())
                .updated_Date(LocalDateTime.now())
                .isActive(1)
                .build();

        List<MGroupEntity> mGroupEntityList = mGroupJpa.findAll();
        mGroupEntityList
                .stream()
                .map(f -> MGroupEntity.builder()
                        .id(f.getId())
                        .name(f.getName())
                        .description(f.getDescription())
                        .category(f.getCategory())
                        .location(f.getLocation())
                        .leader(f.getLeader())
                        .created_Date(f.getCreated_Date())
                        .isActive(0)
                        .build()
                ).forEach(mGroupJpa::save);

        return mGroupJpa.save(mGroupEntity);
    }

    @Override
    public void delete(int id) {

    }
}

    }
