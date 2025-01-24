package org.jtgm.sys.repository.entity.mgroup;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="MGROUP")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class MGroupEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String mgroupName;

    @Column(name = "DESCRIPTION")
    private String mgroupDesc;

    @Column(name = "CATEGORY")
    private String mgroupCateg;

    @Column(name = "LOCATION")
    private String mgroupLoc;

    @Column(name = "LEADER")
    private Long mgroupLead;

    @Column(name="CREATED_DATE")
    private LocalDateTime mgroupCreate;

    @Column(name="UPDATED_DATE")
    private LocalDateTime mgroupUpdate;
}
