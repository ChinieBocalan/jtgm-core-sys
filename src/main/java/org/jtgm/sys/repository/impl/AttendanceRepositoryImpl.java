package org.jtgm.sys.repository.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.jtgm.sys.core.dto.AttendanceDTO;
import org.jtgm.sys.repository.AttendanceRepository;
import org.jtgm.sys.repository.entity.attendance.AttendanceEntity;
import org.jtgm.sys.repository.entity.healthcheck.HealtchCheckEntity;
import org.jtgm.sys.repository.exception.GenericRepositoryErrorException;
import org.jtgm.sys.repository.jpa.AttendanceJpa;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class AttendanceRepositoryImpl implements AttendanceRepository {

    final private AttendanceJpa attendanceJpa;

    @Override
    public AttendanceEntity getHealthCheckDetails() {
        try {
            log.info("[INFO] Retrieving details from database");
            AttendanceEntity attendanceEntity = attendanceJpa.findByIsActive(1).get();
            log.info("[INFO] Retrieving details from database");
            return attendanceEntity;
        } catch (Exception e) {
            throw new GenericRepositoryErrorException("[ERROR] Failed to retrieve details", e);
        }
    }

    @Override
    public AttendanceEntity update(AttendanceDTO attendanceDTO) {
        new AttendanceEntity();
        AttendanceEntity attendanceEntity = AttendanceEntity.builder()
                .lastname(attendanceDTO.getLastName())
                .firstname(attendanceDTO.getFirstName())
                .birthdate(attendanceDTO.getBirthDate())
                .address(attendanceDTO.getAddress())
                .municipality(attendanceDTO.getMunicipality())
                .barangay(attendanceDTO.getBarangay())
                .date_joined(attendanceDTO.getDateJoined())
                .created_date(attendanceDTO.getCreatedDate())
                .updated_date(attendanceDTO.getUpdatedDate())
                .build();

        List<AttendanceEntity> attendanceEntityList = attendanceJpa.findAll();
        attendanceEntityList
                .stream()
                .map(f -> AttendanceEntity.builder()
                        .id(f.getId())
                        .lastname(f.getLastname())
                        .firstname(f.getFirstname())
                        .birthdate(f.getBirthdate())
                        .address(f.getAddress())
                        .municipality(f.getMunicipality())
                        .barangay(f.getBarangay())
                        .date_joined(f.getDate_joined())
                        .created_date(f.getCreated_date())
                        .updated_date(f.getUpdated_date())
                        .build()
                ).forEach(attendanceJpa::save);

        return attendanceJpa.save(attendanceEntity);
    }
}