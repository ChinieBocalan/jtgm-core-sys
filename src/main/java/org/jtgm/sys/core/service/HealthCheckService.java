package org.jtgm.sys.core.service;


import org.jtgm.sys.core.dto.HealthCheckDTO;

public interface HealthCheckService {
    HealthCheckDTO getHealthCheckDetails();
    HealthCheckDTO update(HealthCheckDTO healthCheckDTO);
    void delete(int id);
}
