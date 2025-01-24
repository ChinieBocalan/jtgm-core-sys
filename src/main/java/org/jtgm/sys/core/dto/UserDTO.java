package org.jtgm.sys.core.dto;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

}
