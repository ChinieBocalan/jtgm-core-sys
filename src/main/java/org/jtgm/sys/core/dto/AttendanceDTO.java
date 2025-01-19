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
    private String LASTNAME;
    private String FIRSTNAME;
    private LocalDate BIRTHDATE;
    private String ADDRESS;
    private String MUNICIPALITY;
    private String BARANGAY;
    private LocalDate DATE_JOINED;
    private LocalDate CREATED_DATE;
    private LocalDate UPDATED_DATE;
}
