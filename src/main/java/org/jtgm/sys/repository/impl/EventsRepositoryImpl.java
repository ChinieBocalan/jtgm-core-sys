package org.jtgm.sys.repository.impl;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.EventsDTO;
import org.jtgm.sys.repository.EventsRepository;
import org.jtgm.sys.repository.entity.events.EventsEntity;
import org.jtgm.sys.repository.jpa.EventsJpa;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Slf4j

public class EventsRepositoryImpl implements EventsRepository {
final private EventsJpa eventsJpa;
    @Override
    public EventsEntity update(EventsDTO eventsDTO) {
        new EventsEntity();
        EventsEntity eventsEntity=new EventsEntity().builder()
                .name(eventsDTO.getName())
                .description(eventsDTO.getDescription())
                .actualDate(eventsDTO.getActualDate())
                .proposalDate(eventsDTO.getProposalDate())
                .createdDate(eventsDTO.getCreatedDate())
                .updatedDate(eventsDTO.getUpdatedDate())
                .build();

        return eventsJpa.save(eventsEntity);
    }
}
