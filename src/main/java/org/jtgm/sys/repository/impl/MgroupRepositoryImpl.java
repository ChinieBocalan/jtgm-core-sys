package org.jtgm.sys.repository.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.MgroupDTO;
import org.jtgm.sys.repository.MgroupRepository;
import org.jtgm.sys.repository.entity.mgroup.MGroupEntity;
import org.jtgm.sys.repository.exception.GenericRepositoryErrorException;
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
    public MGroupEntity getMGroupDetails() {
        try {
            log.info("[INFO] Retrieving details from database");
            MGroupEntity mGroupEntity = mgroupServiceJpa.findByIsActive(1).get();
            log.info("[INFO] Retrieving details from database");
            return mGroupEntity;
        }catch (Exception e){
            throw new GenericRepositoryErrorException("[ERROR] Failed to retrieve details", e);
        }
    }
}
