package org.jtgm.sys.repository.entity.healthcheck;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="HEALTHCHECKTBL")
@NoArgsConstructor
public class HealtchCheckEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SYS_NAME")
    private String sysName;

    @Column(name = "SYS_DESC")
    private String sysDesc;

    @Column(name="DATE")
    private LocalDateTime date;

    @Column(name="VERSION")
    private String version;

    @Column(name="IS_ACTIVE")
    private Integer isActive;

}
