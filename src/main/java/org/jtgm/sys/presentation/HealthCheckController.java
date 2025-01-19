package org.jtgm.sys.presentation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.HealthCheckDTO;
import org.jtgm.sys.core.exception.GenericServiceErrorException;
import org.jtgm.sys.core.service.HealthCheckService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jtgm/health-check")
@Slf4j
@RequiredArgsConstructor
public class HealthCheckController {
    final private HealthCheckService healthCheckService;

    @GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HealthCheckDTO> checkSystemHealth() {
        try {
            log.info("[INFO] Health Check Getting Started");
            HealthCheckDTO healthCheckDTO = healthCheckService.getHealtCheckDetails();
            log.info("[END] Successfully hit the endpoint.");
            return ResponseEntity.ok(healthCheckDTO);
        } catch (Exception e){
            throw new GenericServiceErrorException("Failed to reach the database", e);
        }
    }

    @PostMapping(path="/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HealthCheckDTO> updateSystemHealth(@RequestBody HealthCheckDTO healthCheckDTO) {
        try {
            log.info("[INFO] Health Check Update Started");
            healthCheckService.update(healthCheckDTO);
            log.info("[END] Successfully updated the health check details.");
            return ResponseEntity.ok(healthCheckDTO);
        } catch (Exception e){
            throw new GenericServiceErrorException("Failed to reach the database", e);
        }
    }

}
