package org.jtgm.sys.repository;

import org.jtgm.sys.core.dto.AttendanceDTO;
import org.jtgm.sys.repository.entity.attendance.AttendanceEntity;

public interface AttendanceRepository {

    AttendanceEntity getHealthCheckDetails();

    AttendanceEntity update(AttendanceDTO attendanceDTO);
}
