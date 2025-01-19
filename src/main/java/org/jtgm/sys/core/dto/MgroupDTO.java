package org.jtgm.sys.core.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

public class MgroupDTO {
    private Long id;
    private String mgroupName;
    private String mgroupDesc;
    private String mgroupCateg;
    private String mgroupLoc;
    private Long mgroupLead;
    private Date mgroupCreate;
    private LocalDateTime mgroupUpdate;
}
