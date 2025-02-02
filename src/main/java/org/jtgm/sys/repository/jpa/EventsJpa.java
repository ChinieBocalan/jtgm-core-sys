package org.jtgm.sys.repository.jpa;

import org.jtgm.sys.repository.entity_events.EventsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventsJpa extends JpaRepository<EventsEntity, Integer> {

}
