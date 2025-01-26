package org.jtgm.sys.repository;

import org.jtgm.sys.core.dto.HealthCheckDTO;
import org.jtgm.sys.core.dto.MGroupDTO;
import org.jtgm.sys.repository.entity.healthcheck.HealtchCheckEntity;
import org.jtgm.sys.repository.entity.healthcheck.MGroupEntity;

public interface MGroupRepository {
    HealtchCheckEntity getHealthCheckDetails();
    MGroupEntity update(MGroupDTO mGroupDTO);
    void delete(int id);
}
