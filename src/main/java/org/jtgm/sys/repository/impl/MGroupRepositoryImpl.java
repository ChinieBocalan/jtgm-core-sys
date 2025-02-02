package org.jtgm.sys.repository.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.repository.MGroupRepository;
import org.jtgm.sys.repository.entity.mgroup.MGroupEntity;
import org.jtgm.sys.repository.exception.GenericRepositoryErrorException;
import org.jtgm.sys.repository.jpa.MGroupJpa;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class MGroupRepositoryImpl implements MGroupRepository {

    final private MGroupJpa mGroupJpa;

    @Override
    public List<MGroupEntity> getMGroupListDetails() {
        try {
            log.info("[INFO] Retrieving details from database");
            List<MGroupEntity> mGroupEntity= mGroupJpa.findAll();
            log.info("[INFO] Retrieving details from database");
            return mGroupEntity;
        }catch (Exception e){
            throw new GenericRepositoryErrorException("[ERROR] Failed to retrieve details", e);
        }
    }

}


