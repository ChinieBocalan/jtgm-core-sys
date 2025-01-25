package org.jtgm.sys.repository.jpa;

import org.jtgm.sys.repository.entity.attendance.AttendanceEntity;
import org.jtgm.sys.repository.entity.healthcheck.HealtchCheckEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;

@Repository
public interface AttendanceJpa extends JpaRepository<AttendanceEntity, Integer> {
    Optional<AttendanceEntity> findByIsActive(Integer isActive);
}