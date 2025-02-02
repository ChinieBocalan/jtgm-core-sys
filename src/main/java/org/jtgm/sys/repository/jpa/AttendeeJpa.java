package org.jtgm.sys.repository.jpa;

import org.jtgm.sys.repository.entity.attendee.AttendeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendeeJpa extends JpaRepository<AttendeeEntity, Integer> {
}