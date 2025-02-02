package org.jtgm.sys.core.dto;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AttendeeDTO {
    private Long id;
    private String lastName;
    private String firstName;
    private LocalDateTime birthDate;
    private String address;
    private String municipality;
    private String barangay;
    private LocalDateTime dateJoined;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
