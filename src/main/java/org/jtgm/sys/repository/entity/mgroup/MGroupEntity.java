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
    private String NAME;

    @Column(name = "DESCRIPTION")
    private String DESCRIPTION;

    @Column(name = "CATEGORY")
    private String CATEGORY;

    @Column(name = "LOCATION")
    private String LOCATION;

    @Column(name = "LEADER")
    private Integer LEADER;

    @Column(name="CREATED_DATE")
    private LocalDateTime CREATED_DATE;

    @Column(name="UPDATED_DATE")
    private LocalDateTime UPDATED_DATE;
}
