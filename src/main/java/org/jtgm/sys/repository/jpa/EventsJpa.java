package org.jtgm.sys.repository.jpa;

import org.jtgm.sys.repository.entity.events.EventsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsJpa extends JpaRepository<EventsEntity, Integer> {
}
