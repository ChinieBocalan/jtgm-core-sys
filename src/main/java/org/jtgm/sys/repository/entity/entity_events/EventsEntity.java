package org.jtgm.sys.repository.entity.entity_events;

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
    private String NAME;

    @Column(name = "DESCRIPTION")
    private String DESCRIPTION;

    @Column(name="ACTUAL_DATE")
    private LocalDateTime ACTUAL_DATE;

    @Column(name="PROPOSAL_DATE")
    private LocalDateTime PROPOSAL_DATE;

    @Column(name="CREATED_DATE")
    private LocalDateTime CREATED_DATE;

    @Column(name="UPDATED_DATE")
    private LocalDateTime UPDATED_DATE;

}
