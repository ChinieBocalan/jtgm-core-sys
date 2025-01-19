package org.jtgm.sys.core.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceDTO {
    private Long id;
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private String address;
    private String municipality;
    private String barangay;
    private LocalDate dateJoined;
    private LocalDate createdDate;
    private LocalDate updatedDate;
}
