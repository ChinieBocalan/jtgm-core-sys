package org.jtgm.sys.presentation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.UserDTO;
import org.jtgm.sys.core.exception.GenericServiceErrorException;
import org.jtgm.sys.core.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jtgm/user")
@Slf4j
@RequiredArgsConstructor
public class UserController {
    final private UserService userService;

    @PostMapping(path="/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> updateSystemUser(@RequestBody UserDTO userDTO) {
        try {
            log.info("[INFO] User Update Started");
            UserDTO userDTO1 = userService.update(userDTO);
            log.info("[END] Successfully updated the user details.");
            return ResponseEntity.ok(userDTO1);
        } catch (Exception e){
            throw new GenericServiceErrorException("Failed to reach the database", e);
        }
    }
}
