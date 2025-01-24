package org.jtgm.sys.core.dto;

import lombok.*;

import java.time.LocalDateTime;
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MgroupDTO {
    private Long id;
    private String mgroupName;
    private String mgroupDesc;
    private String mgroupCateg;
    private String mgroupLoc;
    private Long mgroupLead;
    private LocalDateTime mgroupCreate;
    private LocalDateTime mgroupUpdate;
}
