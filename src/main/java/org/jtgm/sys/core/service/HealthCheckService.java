package org.jtgm.sys.core.service;

import org.jtgm.sys.core.dto.HealthCheckDTO;

public interface HealthCheckService {
    HealthCheckDTO getHealtCheckDetails();
    HealthCheckDTO update(HealthCheckDTO healthCheckDTO);
    void delete(int id);
}
