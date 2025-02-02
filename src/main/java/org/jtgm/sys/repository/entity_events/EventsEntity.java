package org.jtgm.sys.repository.entity_events;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="EVENTS")
@NoArgsConstructor
@Builder
@AllArgsConstructor

public class EventsEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String sysName;

    @Column(name = "DESCRIPTION")
    private String sysDesc;

    @Column(name="ACTUAL_DATE")
    private LocalDateTime actualDate;

    @Column(name="PROPOSAL_DATE")
    private LocalDateTime proposalDate;

    @Column(name="CREATED_DATE")
    private LocalDateTime createdDate;

    @Column(name="UPDATED_DATE")
    private LocalDateTime updateDate;

}
