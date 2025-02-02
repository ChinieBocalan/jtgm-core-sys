package org.jtgm.sys.core.dto;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String userName;
    private String passWord;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
