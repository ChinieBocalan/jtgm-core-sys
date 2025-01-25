package org.jtgm.sys.presentation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.AttendanceDTO;
import org.jtgm.sys.core.exception.GenericServiceErrorException;
import org.jtgm.sys.core.service.AttendanceService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jtgm/attendance")
@Slf4j
@RequiredArgsConstructor
public class AttendanceController {
    final private AttendanceService attendanceService;

    @GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AttendanceDTO> checkSystemHealth() {
        try {
            log.info("[END] Successfully hit the endpoint.");
        } catch (Exception e) {
            throw new GenericServiceErrorException("Failed to reach the database", e);
        }
    }



    
    @PostMapping(path="/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AttendanceDTO> updateSystemHealth(@RequestBody AttendanceDTO attendanceDTO) {
        try {
            log.info("[INFO] Attendance Update Started");
            AttendanceService.update(attendanceDTO);
            log.info("[END] Successfully updated the attendance details.");
            return ResponseEntity.ok(attendanceDTO);
        } catch (Exception e){
            throw new GenericServiceErrorException("Failed to reach the database", e);
    }
}
}



}