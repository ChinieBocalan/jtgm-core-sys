package org.jtgm.sys.presentation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.HealthCheckDTO;
import org.jtgm.sys.core.dto.UserDTO;
import org.jtgm.sys.core.exception.GenericServiceErrorException;
import org.jtgm.sys.core.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jtgm/user")
@Slf4j
@RequiredArgsConstructor
public class UserController {
    final private UserService userService;

    @PostMapping(path="/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> updateSystemUser(@RequestBody UserDTO userDTO) {
        try {
            log.info("[INFO] User create/update has been started");
            UserDTO userDTOResponse = userService.update(userDTO);
            log.info("[END] Successfully updated the user details.");
            return ResponseEntity.ok(userDTOResponse);
        } catch (Exception e){
            throw new GenericServiceErrorException("Failed to reach the database", e);
        }
    }

    @GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserDTO>> fetchUser() {
        try {
            log.info("[INFO] Health Check Getting Started");
            List<UserDTO> userDTOList = userService.getUserDetails();
            log.info("[END] Successfully hit the endpoint.");
            return ResponseEntity.ok(userDTOList);
        } catch (Exception e){
            throw new GenericServiceErrorException("Failed to reach the database", e);
        }
    }
}
