package org.jtgm.sys.core.service;

import org.jtgm.sys.core.dto.AttendanceDTO;

public interface AttendanceService {
    AttendanceDTO getAttendanceDetails();
    AttendanceDTO update(AttendanceDTO AttendanceDTO);
}
