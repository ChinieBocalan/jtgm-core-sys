package org.jtgm.sys.repository.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.repository.EventsRepository;
import org.jtgm.sys.repository.entity_events.EventsEntity;
import org.jtgm.sys.repository.exception.GenericRepositoryErrorException;
import org.jtgm.sys.repository.jpa.EventsJpa;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RequiredArgsConstructor
@Slf4j

public class EventsRepositoryImpl implements EventsRepository{

    final private EventsJpa eventsJpa;

    @Override
    public List<EventsEntity> getEventsDetails() {
        try {
            log.info("[INFO] Retrieving details from database");
            List<EventsEntity> eventsEntity = eventsJpa.findAll();
            log.info("[INFO] Retrieving details from database");
            return eventsEntity;
        }catch (Exception e){
            throw new GenericRepositoryErrorException("[ERROR] Failed to retrieve details", e);
        }
    }
}
