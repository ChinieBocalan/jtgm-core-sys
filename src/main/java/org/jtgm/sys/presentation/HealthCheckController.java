package org.jtgm.sys.presentation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.HealthCheckDTO;
import org.jtgm.sys.core.exception.GenericServiceErrorException;
import org.jtgm.sys.core.service.HealthCheckService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jtgm")
@Slf4j
@RequiredArgsConstructor
public class HealthCheckController {
    final private HealthCheckService healthCheckService;

    @GetMapping(path="/health-check", produces = MediaType.APPLICATION_JSON_VALUE)
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

}
