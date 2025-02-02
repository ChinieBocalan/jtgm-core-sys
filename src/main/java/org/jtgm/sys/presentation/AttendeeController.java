package org.jtgm.sys.presentation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.AttendeeDTO;
import org.jtgm.sys.core.exception.GenericServiceErrorException;
import org.jtgm.sys.core.service.AttendeeService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/jtgm/attendee")
@Slf4j
@RequiredArgsConstructor
public class AttendeeController {
    final private AttendeeService attendeeService;

    @GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AttendeeDTO>> checkAttendeeList() {
        try {
            log.info("[INFO] Attendee Information Getting Started");
            List<AttendeeDTO> attendeeDTO = attendeeService.getAttendeeDetails();
            log.info("[END] Successfully hit the endpoint.");
            return ResponseEntity.ok(attendeeDTO);
        } catch (Exception e){
            throw new GenericServiceErrorException("Failed to reach the database", e);
        }
    }
}
