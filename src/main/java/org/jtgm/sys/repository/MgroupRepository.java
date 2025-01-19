package org.jtgm.sys.repository;

import org.jtgm.sys.core.dto.MgroupDTO;
import org.jtgm.sys.repository.entity.mgroup.MGroupEntity;

public interface MgroupRepository {
    MGroupEntity getMGroupDetails();
    MGroupEntity update(MgroupDTO mgroupDTO);
}
