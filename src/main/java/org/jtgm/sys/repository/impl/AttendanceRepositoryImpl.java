package org.jtgm.sys.repository.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.repository.AttendanceRepository;
import org.jtgm.sys.repository.entity.attendance.AttendanceEntity;
import org.jtgm.sys.repository.entity.healthcheck.HealtchCheckEntity;
import org.jtgm.sys.repository.exception.GenericRepositoryErrorException;
import org.jtgm.sys.repository.jpa.HealthCheckJpa;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Slf4j
public class AttendanceRepositoryImpl implements AttendanceRepository {

        final private AttendanceJpa attendanceJpa;

        @Override
        public AttendanceEntity getAttendanceDetails() {
                try {
                        log.info("[INFO] Retrieving details from database");
                        AttendanceEntity attendanceEntity = attendanceJpa.findByIsActive(1).get();
                        log.info("[INFO] Retrieving details from database");
                        return attendanceEntity;
                }catch (Exception e){
                        throw new GenericRepositoryErrorException("[ERROR] Failed to retrieve details", e);
                }
        }
