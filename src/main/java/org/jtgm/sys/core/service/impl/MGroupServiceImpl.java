package org.jtgm.sys.core.service.impl;


import lombok.RequiredArgsConstructor;
import org.jtgm.sys.core.dto.MGroupDTO;
import org.jtgm.sys.core.service.MGroupService;
import org.jtgm.sys.repository.MGroupRepository;
import org.jtgm.sys.repository.entity.mgroup.MGroupEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MGroupServiceImpl implements MGroupService {

    final private MGroupRepository mGroupRepository;


    @Override
    public List<MGroupDTO> getMGroupListDetails() {
        List<MGroupEntity> mGroupEntityList = mGroupRepository.getMGroupListDetails();

        return mGroupEntityList
                .stream()
                .map(f -> MGroupDTO.builder()
                        .id(f.getId())
                        .name(f.getName())
                        .description(f.getDescription())
                        .category(f.getCategory())
                        .location(f.getLocation())
                        .leader(f.getLeader())
                        .createdDate(f.getCreatedDate())
                        .updatedDate(f.getUpdatedDate())
                        .build()).toList();
    }
}

