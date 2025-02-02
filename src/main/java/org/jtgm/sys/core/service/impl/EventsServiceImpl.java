package org.jtgm.sys.core.service.impl;

import lombok.RequiredArgsConstructor;
import org.jtgm.sys.core.dto.EventsDTO;
import org.jtgm.sys.core.service.EventsService;
import org.jtgm.sys.repository.EventsRepository;
import org.jtgm.sys.repository.entity_events.EventsEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class EventsServiceImpl implements EventsService {
    final private EventsRepository eventsRepository;

    @Override
    public List<EventsDTO> getEventsDetails() {
        List<EventsEntity> eventsEntityList = eventsRepository.getEventsDetails();

         return eventsEntityList
                 .stream()
                 .map(f -> EventsDTO.builder()
                        .id(f.getId())
                        .sysName(f.getSysName())
                        .sysDesc(f.getSysDesc())
                        .actualDate(f.getActualDate())
                        .actualDate(f.getActualDate())
                        .createdDate(f.getUpdateDate())
                        .build()).toList();
    }


}
