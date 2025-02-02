package org.jtgm.sys.core.dto;

import lombok.*;
import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EventsDTO {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime actualDate;
    private LocalDateTime proposalDate;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

}
