package org.jtgm.sys.repository.entity.attendance;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="ATTENDEE")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class AttendanceEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "LASTNAME")
    private String lastname;

    @Column(name = "FIRSTNAME")
    private String firstname;

    @Column(name="BIRTHDATE")

    @Column(name="ADDRESS")
    private String address;

    @Column(name="MUNICIPALITY")
    private String municipality;

    @Column(name="BARANGAY")
    private String  barangay;

    @Column (name="DATE_JOINED")
    private LocalDate date_joined;

    @Column (name="CREATED_DATE")
    private LocalDate created_date;

    @Column (name= "UPDATED_DATE")
    private LocalDate updated_date;


}
