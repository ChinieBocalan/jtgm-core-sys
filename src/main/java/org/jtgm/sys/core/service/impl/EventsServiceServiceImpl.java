package org.jtgm.sys.core.service.impl;
import lombok.RequiredArgsConstructor;
import org.jtgm.sys.core.dto.EventsDTO;
import org.jtgm.sys.core.service.EventsService;
import org.jtgm.sys.repository.EventsRepository;
import org.jtgm.sys.repository.entity.events.EventsEntity;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class EventsServiceServiceImpl implements EventsService {
final private EventsRepository eventsRepository;
    @Override
    public EventsDTO update(EventsDTO eventsDTO) {
        EventsEntity eventsEntity = eventsRepository.update(eventsDTO);
        return builderEventsDTO(eventsEntity);
    }
       private EventsDTO builderEventsDTO(EventsEntity eventsEntity){
           return EventsDTO.builder()
                .id(eventsEntity.getId())
                .name(eventsEntity.getName())
                .description(eventsEntity.getDescription())
                .actualDate(eventsEntity.getActualDate()==null? LocalDateTime.now():eventsEntity.getActualDate())
                .proposalDate(eventsEntity.getProposalDate()==null? LocalDateTime.now():eventsEntity.getProposalDate())
                .createdDate(eventsEntity.getCreatedDate()==null? LocalDateTime.now():eventsEntity.getCreatedDate())
                .updatedDate(eventsEntity.getUpdatedDate()==null? LocalDateTime.now():eventsEntity.getUpdatedDate())
                .build();
    }
}
