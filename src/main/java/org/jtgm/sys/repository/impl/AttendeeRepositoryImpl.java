package org.jtgm.sys.repository.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.repository.AttendeeRepository;
import org.jtgm.sys.repository.entity.attendee.AttendeeEntity;
import org.jtgm.sys.repository.exception.GenericRepositoryErrorException;
import org.jtgm.sys.repository.jpa.AttendeeJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class AttendeeRepositoryImpl implements AttendeeRepository {

    final private AttendeeJpa attendeeJpa;

    @Override
    public List<AttendeeEntity> getAttendeeDetails() {
        try {
            log.info("[INFO] Retrieving attendee details from database");
            List<AttendeeEntity> attendeeEntity = attendeeJpa.findAll();
            log.info("[INFO] Retrieving details from database");
            return attendeeEntity;
        }catch (Exception e){
            throw new GenericRepositoryErrorException("[ERROR] Failed to retrieve details", e);
        }
    }


}
