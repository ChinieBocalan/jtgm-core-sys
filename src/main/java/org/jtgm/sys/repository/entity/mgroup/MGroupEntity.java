package org.jtgm.sys.repository.entity.mgroup;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="MGroup")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class MGroupEntity {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "NAME")
        private String name;

        @Column(name = "DESCRIPTION")
        private String description;

        @Column(name = "CATEGORY")
        private String category;

        @Column(name = "LOCATION")
        private String location;

        @Column(name = "LEADER")
        private String leader;

        @Column(name = "CREATED_DATE")
        private LocalDateTime createdDate;

        @Column(name = "UPDATED_DATE")
        private LocalDateTime updatedDate;


    }

