package org.jtgm.sys.core.service.impl;

import lombok.RequiredArgsConstructor;
import org.jtgm.sys.core.dto.AttendeeDTO;
import org.jtgm.sys.core.service.AttendeeService;
import org.jtgm.sys.repository.AttendeeRepository;
import org.jtgm.sys.repository.entity.attendee.AttendeeEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class AttendeeServiceImpl implements AttendeeService {
    final private AttendeeRepository attendeeRepository;

    @Override
    public List<AttendeeDTO> getAttendeeDetails() {
        List<AttendeeEntity> attendeeEntityList = attendeeRepository.getAttendeeDetails();

        return attendeeEntityList
            .stream()
                .map(f -> AttendeeDTO.builder()
                    .id(f.getId())
                    .lastName(f.getLastName())
                    .firstName(f.getFirstName())
                    .birthDate(f.getBirthDate())
                    .address(f.getAddress())
                    .municipality(f.getMunicipality())
                    .barangay(f.getBarangay())
                    .dateJoined(f.getDateJoined())
                    .createdDate(f.getCreatedDate())
                    .updatedDate(f.getUpdatedDate())
                    .build()).toList();

    }
}
