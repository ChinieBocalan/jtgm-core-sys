package org.jtgm.sys.presentation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.HealthCheckDTO;
import org.jtgm.sys.core.dto.MGroupDTO;
import org.jtgm.sys.core.exception.GenericServiceErrorException;
import org.jtgm.sys.core.service.MGroupService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jtgm/mgroup")
@Slf4j
@RequiredArgsConstructor
public class MGroupController {
    final private MGroupService mGroupService;

    @GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MGroupDTO> checkSystemHealth() {
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
    public ResponseEntity<MGroupDTO> updateSystemMGroup(@RequestBody MGroupDTO MGroupDTO, MGroupDTO mGroupDTO) {
        try {
            log.info("[INFO] MGroup Update Started");
            MGroupDTO mGroupDTO1 = mGroupService.update(mGroupDTO);
            log.info("[END] Successfully updated the MGroup details.");
            return ResponseEntity.ok(mGroupDTO1);
        } catch (Exception e){
            throw new GenericServiceErrorException("Failed to reach the database", e);
        }
    }

    @DeleteMapping(path="/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> delete(@PathVariable("id") int id) {
        try {
            log.info("[INFO] Health Check Delete Started");
            mGroupService.delete(id);
            log.info("[END] Successfully deleted the health check details.");
            return ResponseEntity.ok("HealtCheck Details successfully deleted");
        } catch (Exception e){
            throw new GenericServiceErrorException("Failed to reach the database", e);
        }
    }

}
