package org.jtgm.sys.repository.jpa;

import org.jtgm.sys.repository.entity.healthcheck.HealtchCheckEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HealthCheckJpa extends JpaRepository<HealtchCheckEntity, Integer> {
    Optional<HealtchCheckEntity> findByIsActive(Integer isActive);
}