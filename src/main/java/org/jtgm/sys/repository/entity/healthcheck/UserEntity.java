package org.jtgm.sys.repository.entity.healthcheck;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="USER")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USERNAME")
    private String userName;

    @Column(name = "PASSWORD")
    private String passWord;

    @Column(name="CREATED_DATE")
    private LocalDateTime createdDate;

    @Column(name="UPDATED_DATE")
    private LocalDateTime updatedDate;
}
