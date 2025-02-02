package org.jtgm.sys.presentation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.EventsDTO;
import org.jtgm.sys.core.service.EventsService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jtgm/events")
@Slf4j
@RequiredArgsConstructor
public class EventsController {
    final private EventsService eventsService;

    @PostMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EventsDTO> updateEvents(@RequestBody EventsDTO eventsDTO) {
        try {
            log.info("Updating Events");
           EventsDTO eventsDTO1 = eventsService.update(eventsDTO);
            log.info("Events are Updated");
            return ResponseEntity.ok(eventsDTO1);

        } catch (Exception e) {
            throw new RuntimeException("Failed", e);
        }

    }
}
