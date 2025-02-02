package org.jtgm.sys.repository;

import org.jtgm.sys.core.dto.EventsDTO;
import org.jtgm.sys.repository.entity.events.EventsEntity;

public interface EventsRepository {

    EventsEntity update(EventsDTO eventsDTO);
}
