package org.jtgm.sys.repository;
import org.jtgm.sys.repository.entity_events.EventsEntity;

import java.util.List;

public interface EventsRepository {
    List<EventsEntity> getEventsDetails();
}
