package org.jtgm.sys.repository;

import org.jtgm.sys.repository.entity.attendee.AttendeeEntity;

import java.util.List;

public interface AttendeeRepository {
    List<AttendeeEntity> getAttendeeDetails();

}
