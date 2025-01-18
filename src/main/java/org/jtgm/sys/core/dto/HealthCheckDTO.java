package org.jtgm.sys.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class HealthCheckDTO {
    private Long id;
    private boolean isActive;
    private String sysName;
    private String version;
    private LocalDateTime date;
}
