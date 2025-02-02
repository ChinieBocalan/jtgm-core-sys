package org.jtgm.sys.presentation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.MGroupDTO;
import org.jtgm.sys.core.exception.GenericServiceErrorException;
import org.jtgm.sys.core.service.MGroupService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/jtgm/mGroup")
@Slf4j
@RequiredArgsConstructor
public class MGroupController {
    final private MGroupService mGroupService;

    @GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<MGroupDTO>> updateMGroupList() {
        try {
            log.info("[INFO] MGroups Getting Started");
            List<MGroupDTO> mGroupDTO = mGroupService.getMGroupListDetails();
            log.info("[END] Successfully hit the endpoint.");
            return ResponseEntity.ok(mGroupDTO);
        } catch (Exception e){
            throw new GenericServiceErrorException("Failed to reach the database", e);
        }
    }
}