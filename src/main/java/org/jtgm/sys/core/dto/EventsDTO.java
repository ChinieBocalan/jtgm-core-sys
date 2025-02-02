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
    private String name;
    private String description;
    private LocalDateTime actualDate;
    private LocalDateTime proposalDate;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
}
