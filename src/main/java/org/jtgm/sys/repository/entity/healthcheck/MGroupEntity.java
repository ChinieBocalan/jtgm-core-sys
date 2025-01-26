package org.jtgm.sys.repository.entity.healthcheck;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

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
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name="CATEGORY")
    private String category;

    @Column(name="LOCATION")
    private String location;

    @Column(name="LEADER")
    private String leader;

    @Column(name="CREATED_DATE")
    private LocalDateTime created_Date;

    @Column(name="UPDATED_DATE")
    private LocalDateTime updated_Date;

    @Column(name="IS_ACTIVE")
    private Integer isActive;

}
