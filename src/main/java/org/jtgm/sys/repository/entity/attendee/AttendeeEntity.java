package org.jtgm.sys.repository.entity.attendee;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="attendee")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class AttendeeEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name="BIRTHDATE")
    private LocalDateTime birthDate;

    @Column(name="ADDRESS")
    private String address;

    @Column(name="MUNICIPALITY")
    private String municipality;

    @Column(name="BARANGAY")
    private String barangay;

    @Column(name="DATE_JOINED")
    private LocalDateTime dateJoined;

    @Column(name="CREATED_DATE")
    private LocalDateTime createdDate;

    @Column(name="UPDATED_DATE")
    private LocalDateTime updatedDate;
}
