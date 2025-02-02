package org.jtgm.sys.presentation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.EventsDTO;
import org.jtgm.sys.core.exception.GenericServiceErrorException;
import org.jtgm.sys.core.service.EventsService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jtgm/events")
@Slf4j
@RequiredArgsConstructor
public class EventsController {
    final private EventsService eventsService;

    @GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EventsDTO>> getAllEvents() {
        try {
            log.info("[INFO] Events Getting Started");
            List<EventsDTO> eventsDTO = eventsService.getEventsDetails();
            log.info("[END] Successfully hit the endpoint.");
            return ResponseEntity.ok(eventsDTO);
        } catch (Exception e){
            throw new GenericServiceErrorException("Failed to reach the database", e);
        }
    }
}
