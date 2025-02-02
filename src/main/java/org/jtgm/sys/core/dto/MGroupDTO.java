package org.jtgm.sys.core.dto;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MGroupDTO{
        private Long id;
        private String name;
        private String description;
        private String category;
        private String location;
        private String leader;
        private LocalDateTime createdDate;
        private LocalDateTime updatedDate;
    }

