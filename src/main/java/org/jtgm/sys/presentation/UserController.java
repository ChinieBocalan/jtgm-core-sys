package org.jtgm.sys.presentation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jtgm.sys.core.dto.HealthCheckDTO;
import org.jtgm.sys.core.dto.UserDTO;
import org.jtgm.sys.core.exception.GenericServiceErrorException;
import org.jtgm.sys.core.service.HealthCheckService;
import org.jtgm.sys.core.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
    @RequestMapping("/jtgm/user")
    @Slf4j
    @RequiredArgsConstructor
    public class UserController {
        final private UserService userService ;



    @GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<UserDTO> checkUser() {
            try {
                log.info("[INFO] User data is Getting Started");
                UserDTO UserDTO = userService.UserDetails();
                log.info("[END] Successfully hit the endpoint.");
                return ResponseEntity.ok(UserDTO);
            } catch (Exception e){
                throw new GenericServiceErrorException("Failed to reach the database", e);
            }
        }
    @PostMapping(path="/update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO) {
        try {
            log.info("[INFO] Health Check Update Started");
            userService.update(userDTO);
            log.info("[END] Successfully updated the health check details.");
            return ResponseEntity.ok(userDTO);
        } catch (Exception e){
            throw new GenericServiceErrorException("Failed to reach the database", e);
        }
    }
}
