package org.jtgm.sys.repository;

import org.jtgm.sys.repository.entity.mgroup.MGroupEntity;
import java.util.List;


public interface MGroupRepository {
    List<MGroupEntity> getMGroupListDetails();
}

