package org.jtgm.sys.core.dto;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HealthCheckDTO {
    private Long id;
    private boolean isActive;
    private String sysName;
    private String sysDesc;
    private String version;
    private LocalDateTime date;
}
