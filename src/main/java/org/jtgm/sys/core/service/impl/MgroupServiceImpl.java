package org.jtgm.sys.core.service.impl;

import lombok.*;
import org.jtgm.sys.core.dto.MgroupDTO;
import org.jtgm.sys.core.service.MgroupService;
import org.jtgm.sys.repository.MgroupRepository;
import org.jtgm.sys.repository.entity.mgroup.MGroupEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

@Service
@RequiredArgsConstructor
public class MgroupServiceImpl implements MgroupService{

    final private MgroupRepository mgroupRepository;

    @Override
    public MgroupDTO getMGroupDetails() {
        MGroupEntity mGroupEntity = mgroupRepository.getMGroupDetails();
        return builderMGroupDTO(mGroupEntity);
    }

    private MgroupDTO builderMGroupDTO(MGroupEntity mGroupEntity){
        return MgroupDTO.builder()
                .id(mGroupEntity.getId())
                .mgroupName(mGroupEntity.getMgroupName())
                .mgroupDesc(mGroupEntity.getMgroupDesc())
                .mgroupCateg(mGroupEntity.getMgroupCateg())
                .mgroupLoc(mGroupEntity.getMgroupLoc())
                .mgroupLead(mGroupEntity.getMgroupLead())
                .mgroupCreate(mGroupEntity.getMgroupCreate() == null ? LocalDateTime.now() : mGroupEntity.getMgroupCreate())
                .mgroupUpdate(mGroupEntity.getMgroupUpdate() == null ? LocalDateTime.now() : mGroupEntity.getMgroupUpdate())
                .build();
    }
}
