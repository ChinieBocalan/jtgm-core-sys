package org.jtgm.sys.presentation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.AttendanceDTO;
import org.jtgm.sys.core.exception.GenericServiceErrorException;
import org.jtgm.sys.core.service.AttendanceService;
import org.jtgm.sys.core.service.HealthCheckService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jtgm/health-check")
@Slf4j
@RequiredArgsConstructor
public class AttendanceController {

    @PostMapping(path="/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AttendanceDTO> updateSystemHealth(@RequestBody AttendanceDTO attendanceDTO) {
        try {
            log.info("[INFO] Attendance Update Started");
            AttendanceService attendanceService;
            attendanceService.update(attendanceDTO);
            log.info("[END] Successfully updated the health check details.");
            return ResponseEntity.ok(attendanceDTO);
        } catch (Exception e){
            throw new GenericServiceErrorException("Failed to reach the database", e);
}
