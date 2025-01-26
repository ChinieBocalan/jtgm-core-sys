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

}
