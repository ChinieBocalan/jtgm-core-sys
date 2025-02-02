package org.jtgm.sys.core.dto;

import java.time.LocalDateTime;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventsDTO {
    private Long id;
    private String NAME;
    private String DESCRIPTION;
    private LocalDateTime ACTUAL_DATE;
    private LocalDateTime PROPOSAL_DATE;
    private LocalDateTime CREATED_DATE;
    private LocalDateTime UPDATED_DATE;
}
