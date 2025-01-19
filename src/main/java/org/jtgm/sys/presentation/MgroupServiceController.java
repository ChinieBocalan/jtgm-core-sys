package org.jtgm.sys.presentation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.HealthCheckDTO;
import org.jtgm.sys.core.dto.MgroupDTO;
import org.jtgm.sys.core.exception.GenericServiceErrorException;
import org.jtgm.sys.core.service.MgroupService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jtgm/mgroup-service")
@Slf4j
@RequiredArgsConstructor
public class MgroupServiceController {
    final private MgroupService MgroupService;

    @PostMapping(path="/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MgroupDTO> updateMgroupDTO(@RequestBody MgroupDTO mgroupDTO) {
        try {
            log.info("[INFO] Health Check Update Started");
            MgroupService.update(mgroupDTO);
            log.info("[END] Successfully updated the health check details.");
            return ResponseEntity.ok(mgroupDTO);
        } catch (Exception e){
            throw new GenericServiceErrorException("Failed to reach the database", e);
        }
    }

}



